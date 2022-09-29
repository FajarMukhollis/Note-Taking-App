package com.fajar.notetakingapp.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/fajar/notetakingapp/ui/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/fajar/notetakingapp/data/repository/LocalRepository;", "(Lcom/fajar/notetakingapp/data/repository/LocalRepository;)V", "_getUserResult", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fajar/notetakingapp/resource/Resource;", "Lcom/fajar/notetakingapp/data/local/user/UserEntity;", "getUser", "Landroidx/lifecycle/LiveData;", "getGetUser", "()Landroidx/lifecycle/LiveData;", "", "username", "", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.fajar.notetakingapp.data.repository.LocalRepository repository = null;
    private androidx.lifecycle.MutableLiveData<com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.user.UserEntity>> _getUserResult;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.fajar.notetakingapp.data.repository.LocalRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fajar.notetakingapp.resource.Resource<com.fajar.notetakingapp.data.local.user.UserEntity>> getGetUser() {
        return null;
    }
    
    public final void getUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
}