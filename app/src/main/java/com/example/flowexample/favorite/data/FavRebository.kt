package com.example.flowexample.favorite.data

import androidx.lifecycle.MutableLiveData
import com.example.flowexample.core.api.GlobalResponse
import com.example.flowexample.core.api.NetworkStatus
import com.example.flowexample.core.api.RestWebService
import com.example.flowexample.core.database.AppDatabase
import com.example.flowexample.core.database.Favourit
import com.example.flowexample.dogbreed.models.BreedImages
import kotlinx.coroutines.*
import java.lang.Exception

class FavRebository(restWebService: RestWebService, var appDatabase: AppDatabase) {


    private val completableJob = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.IO + completableJob)
    var favouiretsLiveFata = MutableLiveData<GlobalResponse<List<Favourit>>?>()

    fun getFavouetesByFilter(breadNameFilter: String): MutableLiveData<GlobalResponse<List<Favourit>>?> {
        coroutineScope.launch {
            try {


            withContext(Dispatchers.Main){
                favouiretsLiveFata.value =GlobalResponse(null,NetworkStatus.LOADING)

            }
            if(breadNameFilter=="All") {
                var response = appDatabase?.favDao()?.getAllFAv()
                withContext(Dispatchers.Main) {
                    favouiretsLiveFata.value =GlobalResponse(response,NetworkStatus.SUCCESS)

                }
            }
            else {
              var    response = appDatabase?.favDao()?.getFavByBreadName(breadNameFilter)
                withContext(Dispatchers.Main) {
                    favouiretsLiveFata.value =GlobalResponse(response,NetworkStatus.SUCCESS)
                }

            }
            }
            catch (e:Exception){
                withContext(Dispatchers.Main) {
                    favouiretsLiveFata.value = GlobalResponse(null, NetworkStatus.ERROR)
                }
            }


        }
    return  favouiretsLiveFata}

    fun favUnFavImage(favoirt: Favourit) {


    }


}