package com.example.flowexample.breedsList.presentation.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.flowexample.core.api.ApiReponse
import com.example.flowexample.core.base.BaseViewModel
import com.example.flowexample.breedsList.data.BreedsRepository
import com.example.flowexample.core.api.GlobalResponse
import kotlinx.coroutines.launch
import javax.inject.Inject

class BreedsVidewModel @Inject constructor(private val breedsRepository: BreedsRepository) :
    BaseViewModel() {
    var response: MutableLiveData<GlobalResponse<ApiReponse>> = MutableLiveData()


    init {
        getDogBreeds()
    }

    fun getDogBreeds() {
        viewModelScope.launch {

            response = breedsRepository.getDogBereds()


        }
    }


}