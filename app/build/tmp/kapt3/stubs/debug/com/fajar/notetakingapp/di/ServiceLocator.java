package com.fajar.notetakingapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/fajar/notetakingapp/di/ServiceLocator;", "", "()V", "provideAppDatabase", "Lcom/fajar/notetakingapp/data/local/database/AppDatabase;", "context", "Landroid/content/Context;", "provideNoteDao", "Lcom/fajar/notetakingapp/data/local/note/NoteDao;", "provideNoteDataSource", "Lcom/fajar/notetakingapp/data/local/note/NoteDataSource;", "provideServiceLocator", "Lcom/fajar/notetakingapp/data/repository/LocalRepository;", "provideUserDao", "Lcom/fajar/notetakingapp/data/local/user/UserDao;", "provideUserDataSource", "Lcom/fajar/notetakingapp/data/local/user/UserDataSource;", "app_debug"})
public final class ServiceLocator {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.notetakingapp.di.ServiceLocator INSTANCE = null;
    
    private ServiceLocator() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.local.database.AppDatabase provideAppDatabase(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.local.user.UserDao provideUserDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.local.user.UserDataSource provideUserDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.local.note.NoteDao provideNoteDao(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.local.note.NoteDataSource provideNoteDataSource(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fajar.notetakingapp.data.repository.LocalRepository provideServiceLocator(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}