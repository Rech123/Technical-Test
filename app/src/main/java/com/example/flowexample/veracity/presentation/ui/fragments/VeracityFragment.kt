package com.example.flowexample.veracity.presentation.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.flowexample.R
import com.example.flowexample.core.base.BaseFragment
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.core.di.modules.ViewModelInjectionField
import com.example.flowexample.veracity.models.USDResponse
import com.example.flowexample.veracity.presentation.viewmodels.VeracityViewModel
import kotlinx.android.synthetic.main.fragment_veracity.view.*
import javax.inject.Inject

import com.example.flowexample.veracity.models.Currency


class VeracityFragment : BaseFragment() {
    private lateinit var toCurrnecy: Currency
    lateinit var SpineerSecondCuuncy: Spinner

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<VeracityViewModel>
    var root: View? = null
    lateinit var et_secondCure: TextView
    lateinit var et_firstcure: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_veracity, container, false)

        mActivity = activity
        SpineerSecondCuuncy = root?.findViewById<Spinner>(R.id.SpineerSecondCuuncy)!!

        et_secondCure = root?.findViewById<TextView>(R.id.et_secondCure)!!
        et_firstcure = root?.findViewById<EditText>(R.id.et_firstCure)!!

        et_firstcure.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                convertTo(p0.toString())
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })


        getCurrencies()

        return root
    }



    private fun convertTo(po: String) {
        if (po.isNullOrEmpty()) {
            et_secondCure.text = ""
            return
        }

        et_secondCure.text = "${toCurrnecy.value * po.toDouble()}"

    }

    private fun getCurrencies() {
        viewModel.get().getUSDRates()
        viewModel.get().response.removeObservers(viewLifecycleOwner)
        viewModel.get().response.observe(viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    when (it.result) {
                        "success" -> handlieSuccess(it)
                        "error" -> handleError()
                    }
                }
            })
    }

    private fun handleError() {
        TODO("Not yet implemented")
    }

    private fun handlieSuccess(usdResponse: USDResponse) {
        setupViews(viewModel.get().formulateData(usdResponse))
    }

    private fun setupViews(curnises: MutableList<Currency>) {


        var adapterSpineerSecondCuuncy = ArrayAdapter(
            requireActivity(),
            android.R.layout.simple_spinner_dropdown_item,
            curnises.map { it.name })
        adapterSpineerSecondCuuncy.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpineerSecondCuuncy.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onNothingSelected(p0: AdapterView<*>?) {
                // You can define your actions as you want
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {

                val selectedObject = SpineerSecondCuuncy.selectedItem
                toCurrnecy = curnises.filter { it.name == selectedObject }?.get(0)

            }
        }


        SpineerSecondCuuncy?.adapter = adapterSpineerSecondCuuncy

    }
}