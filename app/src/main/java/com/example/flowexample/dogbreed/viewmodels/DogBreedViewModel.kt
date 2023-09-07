package com.example.flowexample.dogbreed.viewmodels

import androidx.lifecycle.MutableLiveData
import com.example.flowexample.core.api.GlobalResponse
import com.example.flowexample.core.base.BaseViewModel
import com.example.flowexample.core.database.Favourit
import com.example.flowexample.dogbreed.data.DogBreedsReporiotry
import com.example.flowexample.dogbreed.models.BreedImages
import javax.inject.Inject

class DogBreedViewModel
@Inject constructor(private val dogBreedsReporiotry: DogBreedsReporiotry) :
    BaseViewModel() {

    var breadName = ""
    var response: MutableLiveData<GlobalResponse<BreedImages>> = MutableLiveData()

    fun getDogBreads() {

        response = dogBreedsReporiotry.getDogImagesByBread(this.breadName)
    }

    fun favUnFave(imageURl: String) {
        var favoirt =Favourit()
        favoirt.breedname=breadName
        favoirt.imageUrl=imageURl
        dogBreedsReporiotry.favUnFavImage(favoirt)

    }
}
