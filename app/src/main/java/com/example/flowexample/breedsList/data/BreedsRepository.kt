package com.example.flowexample.breedsList.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.util.RetrofitHelper

import com.example.flowexample.core.api.ApiReponse
import com.example.flowexample.core.api.GlobalResponse
import com.example.flowexample.core.api.NetworkStatus

import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BreedsRepository(private val restService: RestWebService) {

    private var breedsLiveData = MutableLiveData<GlobalResponse<ApiReponse>>()


     fun getDogBereds(): MutableLiveData<GlobalResponse<ApiReponse>> {
       breedsLiveData.value= GlobalResponse(null,NetworkStatus.LOADING)
        val call: Call<ApiReponse> =
            RetrofitHelper.RetrofitHelper.getInstance().create(RestWebService::class.java)
                .getAllBreeds()
        call.enqueue(object : Callback<ApiReponse> {
            override fun onResponse(call: Call<ApiReponse>, response: Response<ApiReponse>) {
                if (response.isSuccessful) {
                    Log.d("requestNow", "onResponse: ${Gson().toJson(response.body())}")
                    if(response.body()?.status=="success") {
                        breedsLiveData.value= GlobalResponse(response.body(),NetworkStatus.SUCCESS)

                    }
                    else {
                        breedsLiveData.value= GlobalResponse(response.body(),NetworkStatus.ERROR)

                    }
                }
            }

            override fun onFailure(call: Call<ApiReponse>, t: Throwable) {
                breedsLiveData.value= GlobalResponse(null,NetworkStatus.ERROR)


                // breedsLiveData.value =response.body()

                Log.d("requestNow", "onResponse: faluire  ${t.message} ${t.cause} ")
            }

        })




        return breedsLiveData
    }

}