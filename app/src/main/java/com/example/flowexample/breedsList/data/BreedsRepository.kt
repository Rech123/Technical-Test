package com.example.flowexample.breedsList.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.util.RetrofitHelper
import com.example.flowexample.breedsList.models.USDResponse
import kotlinx.coroutines.*
import retrofit2.HttpException
import android.content.Context.MODE_PRIVATE

import android.content.SharedPreferences
import com.example.flowexample.core.App
import com.example.flowexample.core.api.ApiReponse
import com.example.flowexample.core.api.GlobalResponse
import com.example.flowexample.core.api.NetworkStatus
import com.example.utils.ConnectionUtils
import com.example.utils.GlobalVars
import com.example.utils.GlobalVars.Companion.KEY_MAIN_CASHE
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class BreedsRepository(private val restService: RestWebService) {
    private val completableJob = Job()

    private var mutableLiveData = MutableLiveData<USDResponse>()
    private var breedsLiveData = MutableLiveData<GlobalResponse<ApiReponse>>()

    private val coroutineScope = CoroutineScope(Dispatchers.IO + completableJob)

    suspend fun getDogBereds(): MutableLiveData<GlobalResponse<ApiReponse>> {
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
                    // Log.d("requestNow", "onResponse: ${response.body()?.message?.message?.values} ")
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

    suspend fun getUSDRates(): MutableLiveData<USDResponse> {

//  mutableLiveData = MutableLiveData()
        Log.d("viemodel", "getUSDRates:  start")
        coroutineScope.launch {

/*  withContext(Dispatchers.Main) {
mutableLiveData.value = Resource.loading(null)
}
val localRequest = localDataSource.getDashboard()
withContext(Dispatchers.Main) {
try {
    mutableLiveData.value = localRequest
} catch (e: HttpException) {
    LocalFunctions.printException(e)

} catch (e: Throwable) {
    LocalFunctions.printException(e)
}
}

*/



            withContext(Dispatchers.Main) {
                try {
                    val remoteRequest = RetrofitHelper.RetrofitHelper.getInstance()
                        .create(RestWebService::class.java).getUSDRates()
                    // val call: Call<USDResponse> = RetrofitHelper.RetrofitHelper.getInstance().create(RestWebService::class.java).getUSDRates()

                    // mutableLiveData.value = remoteRequest

                    Log.d("networkData", "getUSDRates: try  ${mutableLiveData.value}")
                } catch (e: HttpException) {
                    //  LocalFunctions.printException(e)
                    if (!ConnectionUtils.CheckNetwork(App.applicationContext())) {

                        mutableLiveData.value = getCasheUSDRates()

                    }
                    Log.d("networkData", "getUSDRates: catch first   ${e.message()}")

                } catch (e: Throwable) {
                    //   LocalFunctions.printException(e)
                    Log.d("networkData", "getUSDRates: catch second  ${e.message}")

                }
            }
            mutableLiveData.value?.let {
                saveToCashe(it)

            }
/*  remoteRequest.data?.data?.let {
    localDataSource.saveDashboard(
        it
    )
}

*/
        }
//    }


        return mutableLiveData
    }

    private fun saveToCashe(usdResponse: USDResponse) {
        val mPrefs: SharedPreferences =
            App.applicationContext().getSharedPreferences("local", MODE_PRIVATE)

//set variables of 'myObject', etc.

        var prefsEditor = mPrefs.edit();

        var gson = Gson();
        var json = gson.toJson(usdResponse);
        prefsEditor.putString("localUsd", json);
        prefsEditor.commit();

    }

    private fun getCasheUSDRates(): USDResponse {
        val mPrefs: SharedPreferences =
            App.applicationContext().getSharedPreferences(KEY_MAIN_CASHE, MODE_PRIVATE)

        var gson = Gson()
        var json: String? = mPrefs.getString(GlobalVars.key_USD_RATES_CASHE, "")
        var uSDResponse: USDResponse = gson.fromJson(json, USDResponse::class.java)
        return uSDResponse
    }
}