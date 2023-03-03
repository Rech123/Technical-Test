package com.example.flowexample.core.di.modules

import android.content.Context
import com.example.flowexample.core.App
import com.example.flowexample.core.api.RestWebService
import com.example.utils.LocalFunction
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideRestService(context: Context, app: App): RestWebService {
        return LocalFunction.getRestService(context, app, false,false)

    }

   /* @Provides
    @Authorized
    fun provideRestServiceAuthorized(context: Context, app: App): RestWebService {
        LocalFunctions.printLn("provideRestService>>>>>>>>>>>>>>>>>>>activity:>>>>>>>>>>>>>>>>>>." + app.mActivity)
        return LocalFunction.getRestService(context, app, true,false)

    }

    */

}