package com.fajar.notetakingapp.ui.home.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0014\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000bJ\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000bR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter$NoteViewHolder;", "listener", "Lcom/fajar/notetakingapp/ui/home/adapter/NoteItemClickListener;", "(Lcom/fajar/notetakingapp/ui/home/adapter/NoteItemClickListener;)V", "items", "", "Lcom/fajar/notetakingapp/data/local/note/NoteEntity;", "addItems", "", "", "clearItems", "editItem", "item", "position", "", "getItemCount", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "NoteViewHolder", "app_debug"})
public final class NoteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.fajar.notetakingapp.ui.home.adapter.NoteAdapter.NoteViewHolder> {
    private final com.fajar.notetakingapp.ui.home.adapter.NoteItemClickListener listener = null;
    private java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity> items;
    
    public NoteAdapter(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.ui.home.adapter.NoteItemClickListener listener) {
        super();
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity> items) {
    }
    
    public final void addItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity> items) {
    }
    
    public final void editItem(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity item, int position) {
    }
    
    public final void clearItems() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.fajar.notetakingapp.ui.home.adapter.NoteAdapter.NoteViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.ui.home.adapter.NoteAdapter.NoteViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/fajar/notetakingapp/ui/home/adapter/NoteAdapter$NoteViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/fajar/notetakingapp/databinding/ItemRowListBinding;", "listener", "Lcom/fajar/notetakingapp/ui/home/adapter/NoteItemClickListener;", "(Lcom/fajar/notetakingapp/databinding/ItemRowListBinding;Lcom/fajar/notetakingapp/ui/home/adapter/NoteItemClickListener;)V", "bindView", "", "item", "Lcom/fajar/notetakingapp/data/local/note/NoteEntity;", "app_debug"})
    public static final class NoteViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.fajar.notetakingapp.databinding.ItemRowListBinding binding = null;
        private final com.fajar.notetakingapp.ui.home.adapter.NoteItemClickListener listener = null;
        
        public NoteViewHolder(@org.jetbrains.annotations.NotNull()
        com.fajar.notetakingapp.databinding.ItemRowListBinding binding, @org.jetbrains.annotations.NotNull()
        com.fajar.notetakingapp.ui.home.adapter.NoteItemClickListener listener) {
            super(null);
        }
        
        public final void bindView(@org.jetbrains.annotations.NotNull()
        com.fajar.notetakingapp.data.local.note.NoteEntity item) {
        }
    }
}