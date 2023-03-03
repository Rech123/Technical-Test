package com.example.flowexample.core.util

class ErrorType {
    companion object {
        const val MULTI_DEVICE_SESSION = "multi_device_session"
        const val NO_ACCESS = "no_access"
        const val INVALID_DETAILS = "invalid_details"
        const val API_ERROR = "api_error"
        const val DATA_CONNECTION = "no_internet_connection"
        const val ACCOUNT_LOCKED = "account_locked"
        const val ACCOUNT_TEMPORARY_LOCKED = "account_temp_locked"
        const val INVALID_PASSCODE = "invalid_passcode"
        const val BAD_REQUEST = "bad_request"
        const val TOKEN_EXPIRED = "token_expired"
    }
}