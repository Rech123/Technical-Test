package com.example.flowexample.core.util

enum class Status {
    SUCCESS,
    SUCCESS_WITH_LOADING, // keep loading on success // mainly for remote with local data source
    SUCCESS_WITH_COUNT, // mainly where table have big data and count need to show (doc register and asset register)
    ERROR,
    LOADING,
    CANCELED
}
