package com.example.flowexample.core.api

import androidx.annotation.Keep
import com.example.flowexample.core.util.Resource
import com.example.flowexample.veracity.models.USDResponse
import com.example.utils.GlobalVars
import retrofit2.http.GET
import retrofit2.http.Path

@Keep
interface RestWebService {



    @GET(GlobalVars.USD_URL)
    suspend fun getUSDRates(): USDResponse
}