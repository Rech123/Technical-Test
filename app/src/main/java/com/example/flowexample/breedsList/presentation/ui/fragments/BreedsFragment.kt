package com.example.flowexample.breedsList.presentation.ui.fragments

import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.flowexample.core.base.BaseFragment
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.core.di.modules.ViewModelInjectionField
import com.example.flowexample.breedsList.presentation.viewmodels.BreedsVidewModel
import javax.inject.Inject
import androidx.recyclerview.widget.GridLayoutManager

import com.example.flowexample.breedsList.presentation.ui.adapters.BreedsAdapter
import com.example.flowexample.core.api.NetworkStatus
import com.example.utils.LoadingErrorHelper
import kotlinx.android.synthetic.main.fragment_breeds.view.*


class BreedsFragment : BaseFragment() {


    private lateinit var loadingErrorHelper: LoadingErrorHelper
    var adapter: BreedsAdapter? = null
    lateinit var root: View

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<BreedsVidewModel>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root =
            inflater.inflate(com.example.flowexample.R.layout.fragment_breeds, container, false)
        mActivity = activity
        setupViews()
        observeData()

        return root
    }


    private fun observeData() {
        viewModel.get().response.removeObservers(viewLifecycleOwner)
        viewModel.get().response.observe(viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    when (it.networkState) {
                        NetworkStatus.LOADING -> loadingErrorHelper.showLoading()
                        NetworkStatus.ERROR -> loadingErrorHelper.showError(
                            "Something Went wrong",
                            true
                        )
                        NetworkStatus.SUCCESS -> {
                            if(it?.data?.message?.keys==null || it?.data?.message?.keys?.size==0){
                                loadingErrorHelper.showError(
                                    "No Data available  ",
                                    true
                                )
                            }
                            loadingErrorHelper.hideLoadingAndError()
                            adapter?.updateDataSet(ArrayList(it?.data?.message?.keys))

                        }

                    }


                }

            }
        )
    }

    private fun setupViews() {

        adapter = mActivity?.let { BreedsAdapter(it, ::onBreedsClickListener, arrayListOf()) }


        val layoutManager = GridLayoutManager(mActivity, 2)
        root.rv_breeds.layoutManager = layoutManager
        root.rv_breeds.adapter = adapter

        root.tv_fav.setOnClickListener {
            findNavController().navigate(BreedsFragmentDirections.actionBreedsFragment2ToFavFragment())

        }
        //
        loadingErrorHelper = LoadingErrorHelper(mActivity!!, root, ::onRetryVuttonClicked)


    }


    private fun onBreedsClickListener(breed: String, view: View?) {
        Toast.makeText(mActivity, "clicked $breed ", Toast.LENGTH_SHORT).show()
        findNavController().navigate(
            BreedsFragmentDirections.actionBreedsFragment2ToDogbreedFragment(
                breed
            )
        )

    }

    fun onRetryVuttonClicked() {
        viewModel.get().getDogBreeds()

    }
}


