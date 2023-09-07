package com.example.flowexample.core.api

import androidx.annotation.Keep
import com.example.flowexample.dogbreed.models.BreedImages
import com.example.flowexample.breedsList.models.USDResponse
import com.example.utils.GlobalVars
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

@Keep
interface RestWebService {



    @GET(GlobalVars.USD_URL)
    suspend fun getUSDRates(): Call<USDResponse>

    @GET(GlobalVars.API_ALL_BREEDS)
    fun getAllBreeds():Call<ApiReponse>

    @GET("breed/{breedName}/images")
   suspend fun getImagesByBreed(@Path("breedName") breedName:String):Response<BreedImages>
}