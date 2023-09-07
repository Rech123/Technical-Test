package com.example.flowexample.dogbreed.data

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.room.Transaction
import com.example.flowexample.core.App
import com.example.flowexample.core.api.GlobalResponse
import com.example.flowexample.core.api.NetworkStatus
import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.database.AppDatabase
import com.example.flowexample.core.database.Favourit
import com.example.flowexample.core.di.modules.DatabaseModule
import com.example.flowexample.core.util.RetrofitHelper
import com.example.flowexample.dogbreed.models.BreedImages
import com.example.utils.ConnectionUtils
import com.example.utils.LocalFunction
import com.google.gson.Gson
import kotlinx.coroutines.*
import retrofit2.HttpException

class DogBreedsReporiotry(restWebService: RestWebService, var appDatabase: AppDatabase) {
    private val completableJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + completableJob)

    fun getDogImagesByBread(breadName: String): MutableLiveData<GlobalResponse<BreedImages>> {
        var responseDataMutableLiveData = MutableLiveData<GlobalResponse<BreedImages>>()


        coroutineScope.launch {
              withContext(Dispatchers.Main) {
            responseDataMutableLiveData.value = GlobalResponse(null,NetworkStatus.LOADING)
            }




            try {
                val response =
                    RetrofitHelper.RetrofitHelper.getInstance().create(RestWebService::class.java)
                        .getImagesByBreed(breadName)
                withContext(Dispatchers.Main) {
                    Log.d("requestNow", "onResponse: ${Gson().toJson(response.body())}")
                    if (response.isSuccessful) {
                        responseDataMutableLiveData.value = GlobalResponse(response.body(),NetworkStatus.SUCCESS)
                    } else {
                        responseDataMutableLiveData.value = GlobalResponse(null,NetworkStatus.ERROR)

                    }

                }
            } catch (e: HttpException) {
                Log.d("requestNow", "getDogImagesByBread: ${e.message()} ${e.cause}")
                if (!ConnectionUtils.CheckNetwork(App.applicationContext())) {


                }
                withContext(Dispatchers.Main) {
                    responseDataMutableLiveData.value = GlobalResponse(null,NetworkStatus.ERROR)

                }

            } catch (e: Throwable) {
                Log.d("requestNow", "getDogImagesByBread: ${e.message} ${e.cause}")

                withContext(Dispatchers.Main) {
                    responseDataMutableLiveData.value = GlobalResponse(null,NetworkStatus.ERROR)

                }
            }
        }

        return responseDataMutableLiveData
    }

    fun favUnFavImage(favourit: Favourit) {
        coroutineScope.launch {

          //  appDatabase.favDao().
            insertorDeleteFav(favourit)


        }
     }
    @Transaction
     fun insertorDeleteFav(favourit: Favourit){
        var existingFav =appDatabase.favDao().getFavByImageUrlAndBreedName(favourit.imageUrl,favourit.breedname)
        if(existingFav!=null){
            Log.d("requestNow", "insertorDeleteFav:  remove")

            appDatabase.favDao().removeFaveByImageUrlAndBreedName(favourit.imageUrl,favourit.breedname)
        }
        else {
            Log.d("requestNow", "insertorDeleteFav:  insert")
            appDatabase.favDao().insert(favourit)

        }
    }
}