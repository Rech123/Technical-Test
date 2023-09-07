package com.example.flowexample.core.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/flowexample/core/di/modules/FragmentInjectorsModule;", "", "()V", "FavoriteFragmentInjector", "Lcom/example/flowexample/favorite/presentation/ui/fragments/FavoriteFragment;", "breedsListFragmentInjector", "Lcom/example/flowexample/breedsList/presentation/ui/fragments/BreedsFragment;", "dogBreedFragmentInjector", "Lcom/example/flowexample/dogbreed/presentation/ui/fragments/DogBreedFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentInjectorsModule {
    
    public FragmentInjectorsModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.flowexample.breedsList.di.BreedListModule.class})
    public abstract com.example.flowexample.breedsList.presentation.ui.fragments.BreedsFragment breedsListFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.flowexample.dogbreed.di.DogBreedModule.class})
    public abstract com.example.flowexample.dogbreed.presentation.ui.fragments.DogBreedFragment dogBreedFragmentInjector();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.example.flowexample.favorite.di.FavModule.class})
    public abstract com.example.flowexample.favorite.presentation.ui.fragments.FavoriteFragment FavoriteFragmentInjector();
}