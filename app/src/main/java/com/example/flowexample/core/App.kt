package com.example.flowexample.core

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import com.example.flowexample.core.di.components.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class App : Application(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    lateinit var mActivity: Activity
    init {
        instance = this
    }

    companion object {
        private var instance: App? = null

        fun applicationContext() : Context {
            return instance!!.applicationContext
        }
    }

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder()
            .application(this)
            .build()
            .inject(this)

        registerActivityCallbacks()
        val context: Context = App.applicationContext()


    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector

    fun registerActivityCallbacks(){
        registerActivityLifecycleCallbacks(object: ActivityLifecycleCallbacks {
            override fun onActivityPaused(activity: Activity) {
            }

            override fun onActivityStarted(activity: Activity) {
                mActivity = activity

            }

            override fun onActivityDestroyed(activity: Activity) {
            }

            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
            }

            override fun onActivityStopped(activity: Activity) {
            }

            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                mActivity = activity

            }

            override fun onActivityResumed(activity: Activity) {
                mActivity = activity

            }

        })
    }
}