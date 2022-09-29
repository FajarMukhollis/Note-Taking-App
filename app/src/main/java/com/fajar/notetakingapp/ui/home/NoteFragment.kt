package com.fajar.notetakingapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.fajar.notetakingapp.R
import com.fajar.notetakingapp.data.local.note.NoteEntity
import com.fajar.notetakingapp.databinding.FragmentNoteBinding
import com.fajar.notetakingapp.di.ServiceLocator
import com.fajar.notetakingapp.resource.Resource
import com.fajar.notetakingapp.ui.home.adapter.NoteAdapter
import com.fajar.notetakingapp.ui.home.adapter.NoteItemClickListener
import com.fajar.notetakingapp.utils.viewModelFactory

class NoteFragment : Fragment() {

    private var _binding: FragmentNoteBinding? = null
    private val binding get() = _binding!!

    private val viewModel: NoteViewModel by viewModelFactory {
        NoteViewModel(ServiceLocator.provideServiceLocator(requireContext()))
    }
    lateinit var adapter: NoteAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_note, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        setRecyclerView()
        setOnClickListener()
        observeData()
    }

    private fun setRecyclerView() {
        adapter = NoteAdapter(object : NoteItemClickListener {
            override fun onItemClicked(item: NoteEntity) {
                Toast.makeText(requireContext(), "Note clicked!", Toast.LENGTH_SHORT).show()
            }

            override fun onEditClicked(item: NoteEntity, position: Int) {
                showInputAndEditDialog(item.noteId)
                editNote(item, position)
            }

            override fun onDeleteClicked(item: NoteEntity) {
                showDeleteDialog(item)
            }
        })
        val layoutManager = LinearLayoutManager(requireContext())

        binding.rvHome.adapter = adapter
        binding.rvHome.layoutManager = layoutManager
    }

    private fun setOnClickListener() {
        binding.fabAdd.setOnClickListener {
            showInputAndEditDialog()
        }
    }

    override fun onResume() {
        super.onResume()
        getNoteList()
    }

    private fun editNote(item: NoteEntity, position: Int) {
        adapter.editItem(item, position)
    }

    private fun deleteNote(item: NoteEntity) {
        viewModel.deleteNote(item)
    }

    private fun getNoteList() {
        viewModel.getNoteList()
    }

    private fun observeData() {
        viewModel.getNoteListResult.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Success -> bindToAdapter(it.payload)
                is Resource.Error -> Toast.makeText(requireContext(), "Error while getting data", Toast.LENGTH_SHORT).show()
                is Resource.Loading -> {}
            }
        }
        viewModel.deleteResult.observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Success -> {
                    getNoteList()
                    Toast.makeText(requireContext(), "Delete Success", Toast.LENGTH_SHORT).show()
                }
                is Resource.Error -> {
                    Toast.makeText(requireContext(), "Error while deleting data", Toast.LENGTH_SHORT).show()
                }
                else -> {}
            }
        }
    }

    private fun bindToAdapter(notes: List<NoteEntity>?) {
        if (notes.isNullOrEmpty()) {
            binding.isEmpty = true
            adapter.clearItems()
            //set error
        } else {
            binding.isEmpty = false
            adapter.setItems(notes)
        }
    }

    fun showInputAndEditDialog(noteId: Long? = null) {
        NoteCustomDialog(noteId).apply {
            setListener(object : OnItemChangedListener{
                override fun onItemChanged() {
                    getNoteList()
                }
            })
        }.show(parentFragmentManager, "input_and_edit_dialog")
    }

    fun showDeleteDialog(item: NoteEntity) {
        AlertDialog.Builder(requireContext())
            .setTitle("Delete Note")
            .setMessage("Are you sure delete the Note?")
            .setPositiveButton("Delete") { _, _ ->
                deleteNote(item)
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}