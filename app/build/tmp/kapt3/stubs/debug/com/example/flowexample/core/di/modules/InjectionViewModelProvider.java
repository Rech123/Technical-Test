package com.example.flowexample.core.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J+\u0010\u000b\u001a\u00028\u0000\"\b\b\u0001\u0010\f*\u00020\r2\u0006\u0010\u000e\u001a\u0002H\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\u0002\u0010\u0011J+\u0010\u000b\u001a\u00028\u0000\"\b\b\u0001\u0010\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u0002H\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\u0002\u0010\u0015R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/example/flowexample/core/di/modules/InjectionViewModelProvider;", "VM", "Landroidx/lifecycle/ViewModel;", "", "lazyViewModel", "Ldagger/Lazy;", "(Ldagger/Lazy;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory$annotations", "()V", "get", "ACTIVITY", "Landroidx/fragment/app/FragmentActivity;", "activity", "viewModelClass", "Lkotlin/reflect/KClass;", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "FRAGMENT", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class InjectionViewModelProvider<VM extends androidx.lifecycle.ViewModel> {
    private final dagger.Lazy<VM> lazyViewModel = null;
    private final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory = null;
    
    @javax.inject.Inject()
    public InjectionViewModelProvider(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<VM> lazyViewModel) {
        super();
    }
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    private static void getViewModelFactory$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <ACTIVITY extends androidx.fragment.app.FragmentActivity>VM get(@org.jetbrains.annotations.NotNull()
    ACTIVITY activity, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<VM> viewModelClass) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <FRAGMENT extends androidx.fragment.app.Fragment>VM get(@org.jetbrains.annotations.NotNull()
    FRAGMENT fragment, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KClass<VM> viewModelClass) {
        return null;
    }
}