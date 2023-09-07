package com.example.flowexample.dogbreed.di

import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.database.AppDatabase
import com.example.flowexample.core.di.modules.InjectionViewModelProvider
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.dogbreed.data.DogBreedsReporiotry
import com.example.flowexample.dogbreed.presentation.ui.fragments.DogBreedFragment
import com.example.flowexample.dogbreed.viewmodels.DogBreedViewModel
import dagger.Module
import dagger.Provides

@Module
class DogBreedModule {



    @Provides
    @ViewModelInjection
    fun provideDogBreedViewModel(
        fragment: DogBreedFragment,
        viewModelProvider: InjectionViewModelProvider<DogBreedViewModel>
    ) = viewModelProvider.get(fragment, DogBreedViewModel::class)


    @Provides
    fun providesCurrencyRepostiory(restWebService: RestWebService,appDatabase: AppDatabase): DogBreedsReporiotry =
        DogBreedsReporiotry(restWebService,appDatabase)

}
