package com.fajar.notetakingapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00150\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ;\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001d0\u000b\"\u0004\b\u0000\u0010\u001d2\u001c\u0010\u001e\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001d0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010$\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/fajar/notetakingapp/data/repository/LocalRepositoryImpl;", "Lcom/fajar/notetakingapp/data/repository/LocalRepository;", "userDataSource", "Lcom/fajar/notetakingapp/data/local/user/UserDataSource;", "noteDataSource", "Lcom/fajar/notetakingapp/data/local/note/NoteDataSource;", "(Lcom/fajar/notetakingapp/data/local/user/UserDataSource;Lcom/fajar/notetakingapp/data/local/note/NoteDataSource;)V", "checkIfNoteListIsEmpty", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteNote", "Lcom/fajar/notetakingapp/resource/Resource;", "", "note", "Lcom/fajar/notetakingapp/data/local/note/NoteEntity;", "(Lcom/fajar/notetakingapp/data/local/note/NoteEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteById", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNoteList", "", "getUser", "Lcom/fajar/notetakingapp/data/local/user/UserEntity;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertNote", "proceed", "T", "coroutine", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "user", "(Lcom/fajar/notetakingapp/data/local/user/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateNote", "app_debug"})
public final class LocalRepositoryImpl implements com.fajar.notetakingapp.data.repository.LocalRepository {
    private final com.fajar.notetakingapp.data.local.user.UserDataSource userDataSource = null;
    private final com.fajar.notetakingapp.data.local.note.NoteDataSource noteDataSource = null;
    
    public LocalRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.user.UserDataSource userDataSource, @org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteDataSource noteDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object checkIfNoteListIsEmpty(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.user.UserEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteNote(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.note.NoteEntity note, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<java.lang.Number>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoteList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<java.util.List<com.fajar.notetakingapp.data.local.note.NoteEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNoteById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.note.NoteEntity>> continuation) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object proceed(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> coroutine, kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.resource.Resource<T>> continuation) {
        return null;
    }
}