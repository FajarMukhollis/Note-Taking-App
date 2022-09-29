package com.fajar.notetakingapp.databinding;
import com.fajar.notetakingapp.R;
import com.fajar.notetakingapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRowListBindingImpl extends ItemRowListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_edit, 3);
        sViewsWithIds.put(R.id.btn_delete, 4);
        sViewsWithIds.put(R.id.tv_item_date, 5);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRowListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemRowListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[3]
            , (androidx.cardview.widget.CardView) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.cvItemNote.setTag(null);
        this.tvItemDescription.setTag(null);
        this.tvItemTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.NoteEntity == variableId) {
            setNoteEntity((com.fajar.notetakingapp.data.local.note.NoteEntity) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNoteEntity(@Nullable com.fajar.notetakingapp.data.local.note.NoteEntity NoteEntity) {
        this.mNoteEntity = NoteEntity;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.NoteEntity);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String noteEntityTitle = null;
        java.lang.String noteEntityDescription = null;
        com.fajar.notetakingapp.data.local.note.NoteEntity noteEntity = mNoteEntity;

        if ((dirtyFlags & 0x3L) != 0) {



                if (noteEntity != null) {
                    // read NoteEntity.title
                    noteEntityTitle = noteEntity.getTitle();
                    // read NoteEntity.description
                    noteEntityDescription = noteEntity.getDescription();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemDescription, noteEntityDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemTitle, noteEntityTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): NoteEntity
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}