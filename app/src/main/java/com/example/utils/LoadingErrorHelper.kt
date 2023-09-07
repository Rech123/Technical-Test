package com.example.utils

import android.content.Context
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import com.example.flowexample.R

class LoadingErrorHelper  (
    private val context: Context,
    private val rootView: View,
    private val onRetryListener: () -> Unit
) {
    private val progressBar: ProgressBar = rootView.findViewById(R.id.progressBar)
    private val errorTextView: TextView = rootView.findViewById(R.id.errorTextView)
    private val retryButton: Button = rootView.findViewById(R.id.retryButton)

    init {
        retryButton.setOnClickListener {
            onRetryListener.invoke()
        }
    }

    fun showLoading() {
        progressBar.visibility = View.VISIBLE
        errorTextView.visibility = View.GONE
        retryButton.visibility = View.GONE
    }

    fun showError(errorMessage: String ,retry :Boolean=true) {
        progressBar.visibility = View.GONE
        errorTextView.visibility = View.VISIBLE
        errorTextView.text = errorMessage
        if(retry) {
            retryButton.visibility = View.VISIBLE
        }
    }

    fun hideLoadingAndError() {
        progressBar.visibility = View.GONE
        errorTextView.visibility = View.GONE
        retryButton.visibility = View.GONE
    }
}