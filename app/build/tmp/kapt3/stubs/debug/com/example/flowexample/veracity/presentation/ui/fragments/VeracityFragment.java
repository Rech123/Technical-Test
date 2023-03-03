package com.example.flowexample.veracity.presentation.ui.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020&H\u0002J\u0010\u0010+\u001a\u00020&2\u0006\u0010,\u001a\u00020-H\u0002J&\u0010.\u001a\u0004\u0018\u00010\u00162\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0016\u00105\u001a\u00020&2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001c07H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R.\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00068"}, d2 = {"Lcom/example/flowexample/veracity/presentation/ui/fragments/VeracityFragment;", "Lcom/example/flowexample/core/base/BaseFragment;", "()V", "SpineerSecondCuuncy", "Landroid/widget/Spinner;", "getSpineerSecondCuuncy", "()Landroid/widget/Spinner;", "setSpineerSecondCuuncy", "(Landroid/widget/Spinner;)V", "et_firstcure", "Landroid/widget/EditText;", "getEt_firstcure", "()Landroid/widget/EditText;", "setEt_firstcure", "(Landroid/widget/EditText;)V", "et_secondCure", "Landroid/widget/TextView;", "getEt_secondCure", "()Landroid/widget/TextView;", "setEt_secondCure", "(Landroid/widget/TextView;)V", "root", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "setRoot", "(Landroid/view/View;)V", "toCurrnecy", "Lcom/example/flowexample/veracity/models/Currency;", "viewModel", "Ldagger/Lazy;", "Lcom/example/flowexample/veracity/presentation/viewmodels/VeracityViewModel;", "Lcom/example/flowexample/core/di/modules/ViewModelInjectionField;", "getViewModel", "()Ldagger/Lazy;", "setViewModel", "(Ldagger/Lazy;)V", "convertTo", "", "po", "", "getCurrencies", "handleError", "handlieSuccess", "usdResponse", "Lcom/example/flowexample/veracity/models/USDResponse;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "setupViews", "curnises", "", "app_debug"})
public final class VeracityFragment extends com.example.flowexample.core.base.BaseFragment {
    private com.example.flowexample.veracity.models.Currency toCurrnecy;
    public android.widget.Spinner SpineerSecondCuuncy;
    @com.example.flowexample.core.di.modules.ViewModelInjection()
    @javax.inject.Inject()
    public dagger.Lazy<com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel> viewModel;
    @org.jetbrains.annotations.Nullable()
    private android.view.View root;
    public android.widget.TextView et_secondCure;
    public android.widget.EditText et_firstcure;
    private java.util.HashMap _$_findViewCache;
    
    public VeracityFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Spinner getSpineerSecondCuuncy() {
        return null;
    }
    
    public final void setSpineerSecondCuuncy(@org.jetbrains.annotations.NotNull()
    android.widget.Spinner p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.TextView getEt_secondCure() {
        return null;
    }
    
    public final void setEt_secondCure(@org.jetbrains.annotations.NotNull()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.EditText getEt_firstcure() {
        return null;
    }
    
    public final void setEt_firstcure(@org.jetbrains.annotations.NotNull()
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void convertTo(java.lang.String po) {
    }
    
    private final void getCurrencies() {
    }
    
    private final void handleError() {
    }
    
    private final void handlieSuccess(com.example.flowexample.veracity.models.USDResponse usdResponse) {
    }
    
    private final void setupViews(java.util.List<com.example.flowexample.veracity.models.Currency> curnises) {
    }
}