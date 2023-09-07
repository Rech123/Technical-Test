package com.example.flowexample.favorite.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.map
import com.example.flowexample.core.base.BaseViewModel
import com.example.flowexample.core.database.Favourit
import com.example.flowexample.dogbreed.data.DogBreedsReporiotry
import com.example.flowexample.dogbreed.models.BreedImages
import com.example.flowexample.favorite.data.FavRebository
import javax.inject.Inject

class FavViewModel @Inject constructor(private val favRebository: FavRebository) :
    BaseViewModel() {

    var breadNameFilter = "All"
    var response: MutableLiveData<List<String>> = MutableLiveData()
    var filterResponse: MutableLiveData<List<String>> = MutableLiveData()


    fun getFavorites(breadNameFilter: String) {

        this.breadNameFilter = breadNameFilter


        response =
            Transformations.map(favRebository.getFavouetesByFilter(breadNameFilter).map { it?.data }) { it?.map { it.imageUrl } } as MutableLiveData<List<String>>
        if (filterResponse.value == null || filterResponse.value!!.isEmpty()) {
            filterResponse =
                Transformations.map(favRebository.getFavouetesByFilter(breadNameFilter).map { it?.data }) {
                    it?.map { it.breedname }?.distinct()
                } as MutableLiveData<List<String>>
        }

    }

    fun favUnFave(imageURl: String) {
        var favoirt = Favourit()
        favoirt.imageUrl = imageURl
        favRebository.favUnFavImage(favoirt)

    }
}
