package com.example.flowexample.breedsList.di

import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.di.modules.InjectionViewModelProvider
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.breedsList.data.BreedsRepository
import com.example.flowexample.breedsList.presentation.ui.fragments.BreedsFragment
import com.example.flowexample.breedsList.presentation.viewmodels.BreedsVidewModel
import dagger.Module
import dagger.Provides

@Module
class BreedListModule {


    @Provides
    @ViewModelInjection
    fun provideVeracityiewModel(
        fragment: BreedsFragment,
        viewModelProvider: InjectionViewModelProvider<BreedsVidewModel>
    ) = viewModelProvider.get(fragment, BreedsVidewModel::class)


    @Provides
    fun providesCurrencyRepostiory(restWebService: RestWebService): BreedsRepository =
        BreedsRepository(restWebService)

}