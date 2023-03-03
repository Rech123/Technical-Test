package com.example.flowexample.veracity.di

import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.di.modules.InjectionViewModelProvider
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.veracity.data.CurrencyRepostiory
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment
import com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel
import dagger.Module
import dagger.Provides

@Module
class VeracityModule {


    @Provides
    @ViewModelInjection
    fun provideVeracityiewModel(
        fragment: VeracityFragment,
        viewModelProvider: InjectionViewModelProvider<VeracityViewModel>
    ) = viewModelProvider.get(fragment, VeracityViewModel::class)


    @Provides
    fun providesCurrencyRepostiory(restWebService: RestWebService): CurrencyRepostiory =
        CurrencyRepostiory(restWebService)

}