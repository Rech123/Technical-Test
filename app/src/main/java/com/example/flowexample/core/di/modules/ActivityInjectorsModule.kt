package com.example.flowexample.core.di.modules

import com.example.flowexample.veracity.presentation.ui.activites.VeracityActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityInjectorsModule {

    @ContributesAndroidInjector
    abstract fun veracityActivityInjector(): VeracityActivity
}