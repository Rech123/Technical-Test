package com.example.flowexample.core.di.components

import com.example.flowexample.core.App
import com.example.flowexample.core.di.modules.ActivityInjectorsModule
import com.example.flowexample.core.di.modules.AppModule
import com.example.flowexample.core.di.modules.FragmentInjectorsModule
import com.example.flowexample.core.di.modules.NetworkModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityInjectorsModule::class,
        FragmentInjectorsModule::class,
        NetworkModule::class,
       // DatabaseModule::class,
        AppModule::class]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: App): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)

}