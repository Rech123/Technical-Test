package com.example.flowexample.core.api;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\u0005\u00c0\u0006\u0001"}, d2 = {"Lcom/example/flowexample/core/api/RestWebService;", "", "getUSDRates", "Lcom/example/flowexample/veracity/models/USDResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RestWebService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v6/latest/USD")
    public abstract java.lang.Object getUSDRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.flowexample.veracity.models.USDResponse> continuation);
}