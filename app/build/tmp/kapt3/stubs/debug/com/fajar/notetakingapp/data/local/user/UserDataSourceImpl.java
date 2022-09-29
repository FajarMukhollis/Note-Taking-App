package com.fajar.notetakingapp.data.local.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/fajar/notetakingapp/data/local/user/UserDataSourceImpl;", "Lcom/fajar/notetakingapp/data/local/user/UserDataSource;", "userDao", "Lcom/fajar/notetakingapp/data/local/user/UserDao;", "(Lcom/fajar/notetakingapp/data/local/user/UserDao;)V", "getUser", "Lcom/fajar/notetakingapp/data/local/user/UserEntity;", "username", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerUser", "", "user", "(Lcom/fajar/notetakingapp/data/local/user/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserDataSourceImpl implements com.fajar.notetakingapp.data.local.user.UserDataSource {
    private final com.fajar.notetakingapp.data.local.user.UserDao userDao = null;
    
    public UserDataSourceImpl(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.user.UserDao userDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.local.user.UserEntity user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fajar.notetakingapp.data.local.user.UserEntity> continuation) {
        return null;
    }
}