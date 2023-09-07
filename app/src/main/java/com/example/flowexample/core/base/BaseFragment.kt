package com.example.flowexample.core.base

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flowexample.R
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.loading_error.view.*

abstract class BaseFragment : DaggerFragment() {

    var mActivity: Activity?  = null
   /* lateinit var loadingErrorView :View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         loadingErrorView =inflater.inflate(
            R
            .layout.loading_error,container,false)


       loadingErrorView. retryButton.setOnClickListener {
            // Implement retry logic here
            onRetryButtonClicked()
        }

        return loadingErrorView
    }

    protected fun showLoading() {
        if(loadingErrorView==null){
            return
        }
        loadingErrorView. progressBar.visibility = View.VISIBLE
        loadingErrorView.  errorTextView.visibility = View.GONE
        loadingErrorView.  retryButton.visibility = View.GONE
    }

    protected fun showError(errorMessage: String) {
        loadingErrorView.  progressBar.visibility = View.GONE
        loadingErrorView.  errorTextView.visibility = View.VISIBLE
        loadingErrorView.  errorTextView.text = errorMessage
        loadingErrorView. retryButton.visibility = View.VISIBLE
    }

    protected fun hideLoadingOrError() {
        if(loadingErrorView==null){
            return
        }
        loadingErrorView.  progressBar.visibility = View.GONE
        loadingErrorView.  errorTextView.visibility = View.GONE
        loadingErrorView.  retryButton.visibility = View.GONE
    }

    // Abstract method to handle retry action in derived fragments
    protected abstract fun onRetryButtonClicked()

    */
}
