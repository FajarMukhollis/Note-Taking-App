package com.fajar.notetakingapp.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\u001a\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006\'"}, d2 = {"Lcom/fajar/notetakingapp/ui/login/LoginFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/fajar/notetakingapp/databinding/FragmentLoginBinding;", "binding", "getBinding", "()Lcom/fajar/notetakingapp/databinding/FragmentLoginBinding;", "sharedPreferences", "Landroid/content/SharedPreferences;", "viewModel", "Lcom/fajar/notetakingapp/ui/login/LoginViewModel;", "getViewModel", "()Lcom/fajar/notetakingapp/ui/login/LoginViewModel;", "viewModel$delegate", "Lcom/fajar/notetakingapp/utils/LazyViewModelDelegate;", "checkLogin", "", "checkUser", "user", "Lcom/fajar/notetakingapp/data/local/user/UserEntity;", "isLoginInfoValid", "", "navigateToHome", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "saveLoginInfo", "loginInfo", "validateInput", "Companion", "app_debug"})
public final class LoginFragment extends androidx.fragment.app.Fragment {
    private com.fajar.notetakingapp.databinding.FragmentLoginBinding _binding;
    private final com.fajar.notetakingapp.utils.LazyViewModelDelegate viewModel$delegate = null;
    private android.content.SharedPreferences sharedPreferences;
    @org.jetbrains.annotations.NotNull()
    public static final com.fajar.notetakingapp.ui.login.LoginFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN_SHARED_PREF = "login_shared_pref";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGGED_IN_KEY = "logged_in";
    
    public LoginFragment() {
        super();
    }
    
    private final com.fajar.notetakingapp.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    private final com.fajar.notetakingapp.ui.login.LoginViewModel getViewModel() {
        return null;
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
    
    private final void checkLogin() {
    }
    
    private final void checkUser(com.fajar.notetakingapp.data.local.user.UserEntity user) {
    }
    
    private final void saveLoginInfo(boolean loginInfo) {
    }
    
    private final boolean isLoginInfoValid() {
        return false;
    }
    
    private final boolean validateInput() {
        return false;
    }
    
    private final void navigateToHome() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/fajar/notetakingapp/ui/login/LoginFragment$Companion;", "", "()V", "LOGGED_IN_KEY", "", "LOGIN_SHARED_PREF", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}