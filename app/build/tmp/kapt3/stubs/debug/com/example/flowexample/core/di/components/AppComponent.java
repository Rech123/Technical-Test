package com.example.flowexample.core.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0007\u00c0\u0006\u0001"}, d2 = {"Lcom/example/flowexample/core/di/components/AppComponent;", "", "inject", "", "app", "Lcom/example/flowexample/core/App;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.example.flowexample.core.di.modules.ActivityInjectorsModule.class, com.example.flowexample.core.di.modules.FragmentInjectorsModule.class, com.example.flowexample.core.di.modules.NetworkModule.class, com.example.flowexample.core.di.modules.AppModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.example.flowexample.core.App app);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001\u00a8\u0006\u0006\u00c0\u0006\u0001"}, d2 = {"Lcom/example/flowexample/core/di/components/AppComponent$Builder;", "", "application", "Lcom/example/flowexample/core/App;", "build", "Lcom/example/flowexample/core/di/components/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.example.flowexample.core.di.components.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.example.flowexample.core.App application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.example.flowexample.core.di.components.AppComponent build();
    }
}