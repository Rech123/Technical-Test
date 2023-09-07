package com.example.flowexample.core.di.modules

import com.example.flowexample.dogbreed.di.DogBreedModule
import com.example.flowexample.dogbreed.presentation.ui.fragments.DogBreedFragment
import com.example.flowexample.favorite.di.FavModule
import com.example.flowexample.favorite.presentation.ui.fragments.FavoriteFragment
import com.example.flowexample.breedsList.di.BreedListModule
import com.example.flowexample.breedsList.presentation.ui.fragments.BreedsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentInjectorsModule {

    @ContributesAndroidInjector(modules = [BreedListModule::class])
    abstract fun breedsListFragmentInjector(): BreedsFragment


    @ContributesAndroidInjector(modules = [DogBreedModule::class])
    abstract fun dogBreedFragmentInjector(): DogBreedFragment

    @ContributesAndroidInjector(modules = [FavModule::class])
    abstract fun FavoriteFragmentInjector(): FavoriteFragment


}