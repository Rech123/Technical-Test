package com.example.flowexample.core.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00012\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u000eJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0010\u001a\u0002H\t\u00a2\u0006\u0002\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0010\u001a\u0002H\t\u00a2\u0006\u0002\u0010\u0011J#\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u0010\u0010\u001a\u0002H\t\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0014"}, d2 = {"Lcom/example/flowexample/core/util/ResponseHandler;", "", "()V", "getErrorMessage", "", "code", "", "handleException", "Lcom/example/flowexample/core/util/Resource;", "T", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "sendErrorCode", "", "handleSuccess", "data", "(Ljava/lang/Object;)Lcom/example/flowexample/core/util/Resource;", "handleSuccessForCount", "handleSuccessWithLoading", "app_debug"})
public class ResponseHandler {
    
    @javax.inject.Inject()
    public ResponseHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.flowexample.core.util.Resource<T> handleSuccess(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.flowexample.core.util.Resource<T> handleSuccessForCount(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.flowexample.core.util.Resource<T> handleSuccessWithLoading(@org.jetbrains.annotations.NotNull()
    T data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>com.example.flowexample.core.util.Resource<T> handleException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e, boolean sendErrorCode) {
        return null;
    }
    
    private final java.lang.String getErrorMessage(int code) {
        return null;
    }
}