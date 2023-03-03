package com.example.flowexample.core.util

data class Resource<out T>(val status: Status, val data: T?, val message: String?) {
    companion object {
        fun <T> success(data: T?): Resource<T> {
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> successWithLoading(data: T?): Resource<T> {
            return Resource(Status.SUCCESS_WITH_LOADING, data, null)
        }

        fun <T> successWithCount(data: T?): Resource<T> {
            return Resource(Status.SUCCESS_WITH_COUNT, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            return Resource(Status.LOADING, data, null)
        }

        fun <T> canceled(msg: String): Resource<T> {
            return Resource(Status.CANCELED, null, msg)
        }
    }
}