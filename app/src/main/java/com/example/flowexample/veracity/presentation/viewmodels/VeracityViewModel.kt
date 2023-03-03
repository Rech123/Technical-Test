package com.example.flowexample.veracity.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.flowexample.core.base.BaseViewModel
import com.example.flowexample.veracity.data.CurrencyRepostiory
import com.example.flowexample.veracity.models.Currency
import com.example.flowexample.veracity.models.USDResponse
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.reflect.full.declaredMemberProperties

class VeracityViewModel  @Inject constructor (private val currencyRepostiory: CurrencyRepostiory):BaseViewModel() {
    var response: MutableLiveData<USDResponse> = MutableLiveData()





    fun getUSDRates() {
        viewModelScope.launch {

            response = currencyRepostiory.getUSDRates()



        }    }

    fun formulateData(usdResponse: USDResponse) :MutableList<Currency>{

        var currencies = mutableListOf<Currency>()
        usdResponse.rates
        usdResponse.rates?.USD?.let { Currency("USD", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AED?.let { Currency("AED", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AFN?.let { Currency("AFN", it) }?.let { currencies.add(it) }
        usdResponse.rates?.ALL?.let { Currency("ALL", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AMD?.let { Currency("AMD", it) }?.let { currencies.add(it) }
        usdResponse.rates?.ANG?.let { Currency("ANG", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AOA?.let { Currency("AOA", it) }?.let { currencies.add(it) }
        usdResponse.rates?.ARS?.let { Currency("ARS", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AUD?.let { Currency("AUD", it) }?.let { currencies.add(it) }
        usdResponse.rates?.AWG?.let { Currency("AWG", it) }?.let { currencies.add(it) }
return currencies

    }

}