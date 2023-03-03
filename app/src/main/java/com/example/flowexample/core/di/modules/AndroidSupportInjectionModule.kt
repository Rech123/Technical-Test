package com.example.flowexample.core.di.modules

import dagger.Module
import dagger.android.AndroidInjectionModule
import dagger.internal.Beta

@Beta
@Module(includes = [AndroidInjectionModule::class])
abstract class AndroidSupportInjectionModule private constructor()
