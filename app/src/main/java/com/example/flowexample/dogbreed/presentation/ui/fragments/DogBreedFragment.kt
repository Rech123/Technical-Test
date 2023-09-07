package com.example.flowexample.dogbreed.presentation.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.example.flowexample.core.api.NetworkStatus
import com.example.flowexample.core.base.BaseFragment
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.core.di.modules.ViewModelInjectionField
import com.example.flowexample.dogbreed.presentation.ui.adapters.BreedImagesAdapter
import com.example.flowexample.dogbreed.viewmodels.DogBreedViewModel
import com.example.utils.LoadingErrorHelper
import kotlinx.android.synthetic.main.dog_breed_fragment.view.*
import javax.inject.Inject

class DogBreedFragment  : BaseFragment() {
    private lateinit var loadingErrorHelper: LoadingErrorHelper
    val args :DogBreedFragmentArgs by navArgs()

    var adapter: BreedImagesAdapter? = null
    lateinit var root: View
    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<DogBreedViewModel>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root =
            inflater.inflate(com.example.flowexample.R.layout.dog_breed_fragment, container, false)
        mActivity = activity
        fetchArgements()
        setupViews()
        return root
    }



    private fun fetchArgements() {

     args?.let {
         viewModel.get().breadName=it.breadName
         getBreedImages()
     }

    }

    private fun getBreedImages() {
        viewModel.get().getDogBreads()
        viewModel.get().response.removeObservers(viewLifecycleOwner)
        viewModel.get().response.observe(viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    when(it.networkState){
                        NetworkStatus.LOADING->{
                            loadingErrorHelper.showLoading()
                        }
                        NetworkStatus.ERROR->{
                            loadingErrorHelper.showError("Something went Wrong",true)
                        }
                        NetworkStatus.SUCCESS->{
                            if(it.data?.message.isNullOrEmpty()){
                                loadingErrorHelper.showError("no data Avaibile ",true)

                            }
                            else {
                                loadingErrorHelper.hideLoadingAndError()
                                adapter?.updateDataSet(ArrayList(it.data?.message))

                            }
                        }
                    }

                }

            }
        )
    }

    private fun setupViews() {

        adapter = mActivity?.let { BreedImagesAdapter(it, ::onBreedsClickListener, arrayListOf()) }


        val layoutManager = GridLayoutManager(mActivity, 2)
        root.rv_images.layoutManager = layoutManager
        root.rv_images.adapter = adapter

        loadingErrorHelper = LoadingErrorHelper(mActivity!!, root, ::onRetryVuttonClicked)



    }

    private fun onRetryVuttonClicked() {
        getBreedImages()
    }


    private fun onBreedsClickListener(imageURl: String, view: View?) {
        viewModel.get().favUnFave(imageURl)

    }


}