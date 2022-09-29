package com.fajar.notetakingapp.data.local.database;

import java.lang.System;

@androidx.room.Database(entities = {com.fajar.notetakingapp.data.local.user.UserEntity.class, com.fajar.notetakingapp.data.local.note.NoteEntity.class}, version = 4, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\f"}, d2 = {"Lcom/fajar/notetakingapp/data/local/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "noteDao", "Lcom/fajar/notetakingapp/data/local/note/NoteDao;", "getNoteDao", "()Lcom/fajar/notetakingapp/data/local/note/NoteDao;", "userDao", "Lcom/fajar/notetakingapp/data/local/user/UserDao;", "getUserDao", "()Lcom/fajar/notetakingapp/data/local/user/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.notetakingapp.data.local.database.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.Volatile()
    private static volatile com.fajar.notetakingapp.data.local.database.AppDatabase INSTANCE;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fajar.notetakingapp.data.local.user.UserDao getUserDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fajar.notetakingapp.data.local.note.NoteDao getNoteDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/fajar/notetakingapp/data/local/database/AppDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/fajar/notetakingapp/data/local/database/AppDatabase;", "getINSTANCE", "()Lcom/fajar/notetakingapp/data/local/database/AppDatabase;", "setINSTANCE", "(Lcom/fajar/notetakingapp/data/local/database/AppDatabase;)V", "getInstance", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.fajar.notetakingapp.data.local.database.AppDatabase getINSTANCE() {
            return null;
        }
        
        public final void setINSTANCE(@org.jetbrains.annotations.Nullable()
        com.fajar.notetakingapp.data.local.database.AppDatabase p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.fajar.notetakingapp.data.local.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}