package com.example.flowexample.core.util

import com.example.utils.GlobalVars
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper {
    object  RetrofitHelper{


        fun getInstance(): Retrofit {
            return Retrofit.Builder().baseUrl(GlobalVars.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                // we need to add converter factory to
                // convert JSON object to Java object
                .build()
        }
    }
}