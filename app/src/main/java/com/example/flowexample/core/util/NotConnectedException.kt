package com.example.flowexample.core.util

import java.lang.Exception

class NotConnectedException : Exception {
    /**
     * Constructs a `NotConnectedException` with no specified detail
     * message.
     */
    constructor() {}

    /**
     * Constructs a `TimeoutException` with the specified detail
     * message.
     *
     * @param message the detail message
     */
    constructor(message: String?) : super(message) {}

    companion object {
        private const val serialVersionUID = 1900926677490660714L
    }
}