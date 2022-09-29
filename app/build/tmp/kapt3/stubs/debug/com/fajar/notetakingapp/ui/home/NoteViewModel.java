package com.fajar.notetakingapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/fajar/notetakingapp/ui/home/NoteViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/notetakingapp/data/repository/LocalRepository;", "(Lcom/fajar/notetakingapp/data/repository/LocalRepository;)V", "_deleteResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fajar/notetakingapp/resource/Resource;", "", "_getNoteListResult", "", "Lcom/fajar/notetakingapp/data/local/note/NoteEntity;", "_getNoteResult", "_insertResult", "_updateResult", "deleteResult", "Landroidx/lifecycle/LiveData;", "getDeleteResult", "()Landroidx/lifecycle/LiveData;", "getNoteListResult", "getGetNoteListResult", "getNoteResult", "getGetNoteResult", "insertResult", "getInsertResult", "updateResult", "getUpdateResult", "deleteNote", "", "note", "getNoteById", "id", "", "getNoteList", "insertNote", "updateNote", "app_debug"})
public final class NoteViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.notetakingapp.data.repository.LocalRepository repository = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> _insertResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> _updateResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> _deleteResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.note.NoteEntity>> _getNoteResult = null;
    private final androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity>>> _getNoteListResult = null;
    
    public NoteViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.repository.LocalRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> getInsertResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> getUpdateResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<java.lang.Number>> getDeleteResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.note.NoteEntity>> getGetNoteResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity>>> getGetNoteListResult() {
        return null;
    }
    
    public final void insertNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note) {
    }
    
    public final void updateNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note) {
    }
    
    public final void deleteNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note) {
    }
    
    public final void getNoteById(long id) {
    }
    
    public final void getNoteList() {
    }
}