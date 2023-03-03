package com.example.flowexample.veracity.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0006\u0010\u0012\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/flowexample/veracity/data/CurrencyRepostiory;", "", "restService", "Lcom/example/flowexample/core/api/RestWebService;", "(Lcom/example/flowexample/core/api/RestWebService;)V", "completableJob", "Lkotlinx/coroutines/CompletableJob;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "mutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/flowexample/veracity/models/USDResponse;", "getCasheUSDRates", "getUSDRates", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveToCashe", "", "usdResponse", "test", "app_debug"})
public final class CurrencyRepostiory {
    private final com.example.flowexample.core.api.RestWebService restService = null;
    private final kotlinx.coroutines.CompletableJob completableJob = null;
    private androidx.lifecycle.MutableLiveData<com.example.flowexample.veracity.models.USDResponse> mutableLiveData;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    
    public CurrencyRepostiory(@org.jetbrains.annotations.NotNull()
    com.example.flowexample.core.api.RestWebService restService) {
        super();
    }
    
    public final void test() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUSDRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.lifecycle.MutableLiveData<com.example.flowexample.veracity.models.USDResponse>> continuation) {
        return null;
    }
    
    private final void saveToCashe(com.example.flowexample.veracity.models.USDResponse usdResponse) {
    }
    
    private final com.example.flowexample.veracity.models.USDResponse getCasheUSDRates() {
        return null;
    }
}