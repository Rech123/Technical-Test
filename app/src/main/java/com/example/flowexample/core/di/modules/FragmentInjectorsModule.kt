package com.example.flowexample.core.di.modules

import com.example.flowexample.veracity.di.VeracityModule
import com.example.flowexample.veracity.presentation.ui.fragments.VeracityFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentInjectorsModule {

    @ContributesAndroidInjector(modules = [VeracityModule::class])
    abstract fun veracityFragmentInjector(): VeracityFragment

    /*
    @ContributesAndroidInjector(modules = [SplashModule::class])
    abstract fun splashFragmentInjector(): SplashFragment

     */

}