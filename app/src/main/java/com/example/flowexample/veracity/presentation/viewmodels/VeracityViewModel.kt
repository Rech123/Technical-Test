package com.example.flowexample.veracity.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.flowexample.core.base.BaseViewModel
import com.example.flowexample.veracity.data.CurrencyRepostiory
import com.example.flowexample.veracity.models.USDResponse
import kotlinx.coroutines.launch
import javax.inject.Inject

class VeracityViewModel  @Inject constructor (private val currencyRepostiory: CurrencyRepostiory):BaseViewModel() {
    var response: MutableLiveData<USDResponse> = MutableLiveData()


    fun clikced(){
        Log.d("viemodel", "clikced: ${currencyRepostiory.test()}")
viewModelScope.launch {

    response = currencyRepostiory.getUSDRates()

    Log.d("viemodel", "clikced: in view model  ${response.value}")


}
        Log.d("viemodel", "clikced: after ")

    }

    fun getUSDRates() {
        Log.d("viemodel", "clikced: ${currencyRepostiory.test()}")
        viewModelScope.launch {

            response = currencyRepostiory.getUSDRates()

            Log.d("viemodel", "clikced: in view model  ${response.value}")


        }    }

}