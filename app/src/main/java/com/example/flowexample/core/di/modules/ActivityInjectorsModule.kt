package com.example.flowexample.core.di.modules

import com.example.flowexample.breedsList.presentation.ui.activites.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorsModule {

    @ContributesAndroidInjector
    abstract fun veracityActivityInjector(): MainActivity
}