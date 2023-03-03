package com.example.flowexample.veracity.models

import com.google.gson.annotations.SerializedName

data class USDRates(
    @SerializedName("USD")
    var USD: Double? = 0.0,
    @SerializedName("AED")
    var AED: Double? = 0.0,
    @SerializedName("AFN")
    var AFN: Double? = 0.0,
    @SerializedName("ALL")
    var ALL: Double? = 0.0,
    @SerializedName("AMD")
    var AMD: Double? = 0.0,
    @SerializedName("ANG")
    var ANG: Double? = 0.0,
    @SerializedName("AOA")
    var AOA: Double? = 0.0,
    @SerializedName("ARS")
    var ARS: Double? = 0.0,
    @SerializedName("AUD")
    var AUD: Double? = 0.0,
    @SerializedName("AWG")
    var AWG: Double? = 0.0


) {
}
