package com.example.flowexample.veracity.presentation.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/flowexample/veracity/presentation/viewmodels/VeracityViewModel;", "Lcom/example/flowexample/core/base/BaseViewModel;", "currencyRepostiory", "Lcom/example/flowexample/veracity/data/CurrencyRepostiory;", "(Lcom/example/flowexample/veracity/data/CurrencyRepostiory;)V", "response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/flowexample/veracity/models/USDResponse;", "getResponse", "()Landroidx/lifecycle/MutableLiveData;", "setResponse", "(Landroidx/lifecycle/MutableLiveData;)V", "clikced", "", "getUSDRates", "app_debug"})
public final class VeracityViewModel extends com.example.flowexample.core.base.BaseViewModel {
    private final com.example.flowexample.veracity.data.CurrencyRepostiory currencyRepostiory = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.flowexample.veracity.models.USDResponse> response;
    
    @javax.inject.Inject()
    public VeracityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.flowexample.veracity.data.CurrencyRepostiory currencyRepostiory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.flowexample.veracity.models.USDResponse> getResponse() {
        return null;
    }
    
    public final void setResponse(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.example.flowexample.veracity.models.USDResponse> p0) {
    }
    
    public final void clikced() {
    }
    
    public final void getUSDRates() {
    }
}