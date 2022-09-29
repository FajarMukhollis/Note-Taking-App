package com.fajar.notetakingapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\u001a\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\b\u0010,\u001a\u00020\u0015H\u0002J\b\u0010-\u001a\u00020\u0015H\u0002J\u000e\u0010.\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0018J\u0017\u0010/\u001a\u00020\u00152\n\b\u0002\u00100\u001a\u0004\u0018\u000101\u00a2\u0006\u0002\u00102R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u00063"}, d2 = {"Lcom/fajar/notetakingapp/ui/home/NoteFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/fajar/notetakingapp/databinding/FragmentNoteBinding;", "adapter", "Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter;", "getAdapter", "()Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter;", "setAdapter", "(Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter;)V", "binding", "getBinding", "()Lcom/fajar/notetakingapp/databinding/FragmentNoteBinding;", "viewModel", "Lcom/fajar/notetakingapp/ui/home/NoteViewModel;", "getViewModel", "()Lcom/fajar/notetakingapp/ui/home/NoteViewModel;", "viewModel$delegate", "Lcom/fajar/notetakingapp/utils/LazyViewModelDelegate;", "bindToAdapter", "", "notes", "", "Lcom/fajar/notetakingapp/data/local/note/NoteEntity;", "deleteNote", "item", "editNote", "position", "", "getNoteList", "observeData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "setOnClickListener", "setRecyclerView", "showDeleteDialog", "showInputAndEditDialog", "noteId", "", "(Ljava/lang/Long;)V", "app_debug"})
public final class NoteFragment extends androidx.fragment.app.Fragment {
    private com.fajar.notetakingapp.databinding.FragmentNoteBinding _binding;
    private final com.fajar.notetakingapp.utils.LazyViewModelDelegate viewModel$delegate = null;
    public com.fajar.notetakingapp.ui.home.adapter.NoteAdapter adapter;
    
    public NoteFragment() {
        super();
    }
    
    private final com.fajar.notetakingapp.databinding.FragmentNoteBinding getBinding() {
        return null;
    }
    
    private final com.fajar.notetakingapp.ui.home.NoteViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.ui.home.adapter.NoteAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.ui.home.adapter.NoteAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setOnClickListener() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void editNote(com.fajar.notetakingapp.data.local.note.NoteEntity item, int position) {
    }
    
    private final void deleteNote(com.fajar.notetakingapp.data.local.note.NoteEntity item) {
    }
    
    private final void getNoteList() {
    }
    
    private final void observeData() {
    }
    
    private final void bindToAdapter(java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity> notes) {
    }
    
    public final void showInputAndEditDialog(@org.jetbrains.annotations.Nullable()
    java.lang.Long noteId) {
    }
    
    public final void showDeleteDialog(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity item) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}