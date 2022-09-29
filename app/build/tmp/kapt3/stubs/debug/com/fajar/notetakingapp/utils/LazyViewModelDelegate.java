package com.fajar.notetakingapp.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0086\u0002\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/fajar/notetakingapp/utils/LazyViewModelDelegate;", "T", "Landroidx/lifecycle/ViewModel;", "", "viewModelClass", "Ljava/lang/Class;", "viewModelProducer", "Lkotlin/Function0;", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function0;)V", "provider", "Landroidx/lifecycle/ViewModelProvider;", "getValue", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/lifecycle/ViewModelStoreOwner;Lkotlin/reflect/KProperty;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class LazyViewModelDelegate<T extends androidx.lifecycle.ViewModel> {
    private final java.lang.Class<T> viewModelClass = null;
    private final kotlin.jvm.functions.Function0<T> viewModelProducer = null;
    private androidx.lifecycle.ViewModelProvider provider;
    
    public LazyViewModelDelegate(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> viewModelClass, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends T> viewModelProducer) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final T getValue(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelStoreOwner owner, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
}