package com.example.flowexample.veracity.models

import com.google.gson.annotations.SerializedName

data class USDResponse(
    @SerializedName("result")
    var result: String? = "",
    @SerializedName("provider")
    var provider: String? = "",
    @SerializedName("terms_of_use")
    var terms_of_use
    : String? = "",
    @SerializedName("base_code")
    var base_code: String? = "",
    @SerializedName("rates")
    var rates: USDRates?,

)
