package com.example.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/utils/LocalFunction;", "", "()V", "Companion", "app_debug"})
public final class LocalFunction {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.utils.LocalFunction.Companion Companion = null;
    private static com.example.flowexample.core.database.AppDatabase INSTANCE;
    
    public LocalFunction() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/utils/LocalFunction$Companion;", "", "()V", "INSTANCE", "Lcom/example/flowexample/core/database/AppDatabase;", "getAppDatabase", "mContext", "Landroid/content/Context;", "dbName", "", "getRestService", "Lcom/example/flowexample/core/api/RestWebService;", "context", "app", "Lcom/example/flowexample/core/App;", "isAuthorized", "", "fromSync", "printLn", "", "s", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.flowexample.core.api.RestWebService getRestService(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.example.flowexample.core.App app, boolean isAuthorized, boolean fromSync) {
            return null;
        }
        
        public final void printLn(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.flowexample.core.database.AppDatabase getAppDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext, @org.jetbrains.annotations.NotNull()
        java.lang.String dbName) {
            return null;
        }
    }
}