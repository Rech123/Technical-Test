package com.example.flowexample.core.api


data class GlobalResponse<T>(val data :T?, val networkState : NetworkStatus)
enum class NetworkStatus{
    LOADING,SUCCESS,ERROR
}
