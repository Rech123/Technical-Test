package com.example.flowexample.core.util

import com.example.utils.LocalFunction

import retrofit2.HttpException
import java.util.concurrent.CancellationException
import javax.inject.Inject

open class ResponseHandler @Inject constructor() {
    fun <T : Any> handleSuccess(data: T): Resource<T> {
        LocalFunction.printLn("handleSuccess>>>>>>>>>>>>>>>>>>>>>>>>>>")
        return Resource.success(data)
    }

    fun <T : Any> handleSuccessForCount(data: T): Resource<T> {
        LocalFunction.printLn("handleSuccess>>>>>>>>>>>>>>>>>>>>>>>>>>")
        return Resource.successWithCount(data)
    }

    fun <T : Any> handleSuccessWithLoading(data: T): Resource<T> {
        LocalFunction.printLn("handleSuccessWithLoading>>>>>>>>>>>>>>>>>>>>>>>>>>")
        return Resource.successWithLoading(data)
    }

    fun <T : Any> handleException(e: Exception, sendErrorCode: Boolean): Resource<T> {
        try {
            LocalFunction.printLn("handleException>>>>>>>>>>>>>>>>>>>>>>>>>>" + e)
            e.printStackTrace()
            return when (e) {
                //no need to show error for NotConnectedException as it is already handled ("@NoInternetConnection annotation)
                is CancellationException -> Resource.canceled("Canceled")
                is NotConnectedException -> Resource.error(ErrorType.DATA_CONNECTION, null)
                is HttpException ->
                    if (e.code() == 401) {
                        LocalFunction.printLn("handleException>>>>>>>>>>>>>>>>>>>>>>>>>cause 401>" + e.cause)

                        Resource.error("", null)
                    } else {
                        if (sendErrorCode)
                            Resource.error(e.code().toString(), null)
                        else
                            Resource.error(getErrorMessage(Int.MAX_VALUE), null)
                    }
                else -> Resource.error(getErrorMessage(Int.MAX_VALUE), null)
            }
        } catch (e: Exception) {
           // GlobalFunctions.printException(e)
            return Resource.error(getErrorMessage(Int.MAX_VALUE), null)
        }
    }



    private fun getErrorMessage(code: Int): String {
        return when (code) {
//            401 -> "Unauthorized"
//            404 -> "Not found"
            else -> "Something went wrong, Please try again"
        }
    }
}