package com.example.flowexample.veracity.presentation.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001e"}, d2 = {"Lcom/example/flowexample/veracity/presentation/ui/fragments/VeracityFragment;", "Lcom/example/flowexample/core/base/BaseFragment;", "()V", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "viewModel", "Ldagger/Lazy;", "Lcom/example/flowexample/veracity/presentation/viewmodels/VeracityViewModel;", "Lcom/example/flowexample/core/di/modules/ViewModelInjectionField;", "getViewModel", "()Ldagger/Lazy;", "setViewModel", "(Ldagger/Lazy;)V", "getCurrencies", "", "handleError", "handlieSuccess", "usdResponse", "Lcom/example/flowexample/veracity/models/USDResponse;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class VeracityFragment extends com.example.flowexample.core.base.BaseFragment {
    @com.example.flowexample.core.di.modules.ViewModelInjection()
    @javax.inject.Inject()
    public dagger.Lazy<com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel> viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.view.View root;
    private java.util.HashMap _$_findViewCache;
    
    public VeracityFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.Lazy<com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel> getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    dagger.Lazy<com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getRoot() {
        return null;
    }
    
    public final void setRoot(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void getCurrencies() {
    }
    
    private final void handleError() {
    }
    
    private final void handlieSuccess(com.example.flowexample.veracity.models.USDResponse usdResponse) {
    }
}