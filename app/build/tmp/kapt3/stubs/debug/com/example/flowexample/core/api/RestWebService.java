package com.example.flowexample.core.api;

import java.lang.System;

@androidx.annotation.Keep()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\u000e\u00c0\u0006\u0001"}, d2 = {"Lcom/example/flowexample/core/api/RestWebService;", "", "getAllBreeds", "Lretrofit2/Call;", "Lcom/example/flowexample/core/api/ApiReponse;", "getImagesByBreed", "Lretrofit2/Response;", "Lcom/example/flowexample/dogbreed/models/BreedImages;", "breedName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUSDRates", "Lcom/example/flowexample/breedsList/models/USDResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface RestWebService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "v6/latest/USD")
    public abstract java.lang.Object getUSDRates(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Call<com.example.flowexample.breedsList.models.USDResponse>> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "breeds/list/all")
    public abstract retrofit2.Call<com.example.flowexample.core.api.ApiReponse> getAllBreeds();
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "breed/{breedName}/images")
    public abstract java.lang.Object getImagesByBreed(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "breedName")
    java.lang.String breedName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flowexample.dogbreed.models.BreedImages>> continuation);
}