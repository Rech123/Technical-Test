package com.example.flowexample.veracity.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flowexample.R
import com.example.flowexample.core.base.BaseFragment
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.core.di.modules.ViewModelInjectionField
import com.example.flowexample.veracity.models.USDResponse
import com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel
import kotlinx.android.synthetic.main.fragment_veracity.view.*
import javax.inject.Inject

import android.widget.ArrayAdapter

import android.widget.Spinner







class VeracityFragment :BaseFragment() {

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<VeracityViewModel>
    var   root :View?= null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     var   root = inflater.inflate(R.layout.fragment_veracity, container, false)

        mActivity = activity

     root.button2.setOnClickListener {
         viewModel.get().clikced()
     }
getCurrencies()

        return root
    }

    private fun getCurrencies() {
        viewModel.get().getUSDRates()
        viewModel.get().response.removeObservers(viewLifecycleOwner)
        viewModel.get().response.observe(viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    when (it.result) {
                            "success"->  handlieSuccess(it)
                        "error"->handleError()
                    }
                }
            })    }

    private fun handleError() {
        TODO("Not yet implemented")
    }

    private fun handlieSuccess(usdResponse: USDResponse) {
    }


}