package com.example.flowexample.veracity.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/example/flowexample/veracity/di/VeracityModule;", "", "()V", "provideVeracityiewModel", "Lcom/example/flowexample/veracity/presentation/viewmodels/VeracityViewModel;", "fragment", "Lcom/example/flowexample/veracity/presentation/ui/fragments/VeracityFragment;", "viewModelProvider", "Lcom/example/flowexample/core/di/modules/InjectionViewModelProvider;", "providesCurrencyRepostiory", "Lcom/example/flowexample/veracity/data/CurrencyRepostiory;", "restWebService", "Lcom/example/flowexample/core/api/RestWebService;", "app_debug"})
@dagger.Module()
public final class VeracityModule {
    
    public VeracityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.flowexample.core.di.modules.ViewModelInjection()
    @dagger.Provides()
    public final com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel provideVeracityiewModel(@org.jetbrains.annotations.NotNull()
    com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment fragment, @org.jetbrains.annotations.NotNull()
    com.example.flowexample.core.di.modules.InjectionViewModelProvider<com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel> viewModelProvider) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.flowexample.veracity.data.CurrencyRepostiory providesCurrencyRepostiory(@org.jetbrains.annotations.NotNull()
    com.example.flowexample.core.api.RestWebService restWebService) {
        return null;
    }
}