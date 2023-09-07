package com.example.flowexample.favorite.di

import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.database.AppDatabase
import com.example.flowexample.core.di.modules.InjectionViewModelProvider
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.dogbreed.data.DogBreedsReporiotry
import com.example.flowexample.dogbreed.presentation.ui.fragments.DogBreedFragment
import com.example.flowexample.dogbreed.viewmodels.DogBreedViewModel
import com.example.flowexample.favorite.data.FavRebository
import com.example.flowexample.favorite.presentation.ui.fragments.FavoriteFragment
import com.example.flowexample.favorite.viewmodels.FavViewModel
import dagger.Module
import dagger.Provides

@Module
class FavModule {




        @Provides
        @ViewModelInjection
        fun provideFaviewModel(
            fragment: FavoriteFragment,
            viewModelProvider: InjectionViewModelProvider<FavViewModel>
        ) = viewModelProvider.get(fragment, FavViewModel::class)


        @Provides
        fun providesFavRebository(restWebService: RestWebService, appDatabase: AppDatabase): FavRebository =
            FavRebository(restWebService,appDatabase)

    }

