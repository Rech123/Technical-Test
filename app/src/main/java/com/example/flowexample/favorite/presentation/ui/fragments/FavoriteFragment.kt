package com.example.flowexample.favorite.presentation.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.flowexample.core.base.BaseFragment
import com.example.flowexample.core.di.modules.ViewModelInjection
import com.example.flowexample.core.di.modules.ViewModelInjectionField
import com.example.flowexample.dogbreed.presentation.ui.adapters.BreedImagesAdapter
import com.example.flowexample.favorite.viewmodels.FavViewModel
import kotlinx.android.synthetic.main.dog_breed_fragment.view.*
import javax.inject.Inject

import android.widget.ArrayAdapter
import com.example.utils.LoadingErrorHelper
import kotlinx.android.synthetic.main.dog_breed_fragment.view.rv_images
import kotlinx.android.synthetic.main.fav_fragment.view.*


class FavoriteFragment : BaseFragment(), AdapterView.OnItemSelectedListener {


    private lateinit var loadingErrorHelper: LoadingErrorHelper
    private var filterAdapter: ArrayAdapter<String>? = null
    var adapter: BreedImagesAdapter? = null
    lateinit var root: View

    @Inject
    @ViewModelInjection
    lateinit var viewModel: ViewModelInjectionField<FavViewModel>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root =
            inflater.inflate(com.example.flowexample.R.layout.fav_fragment, container, false)
        mActivity = activity
        setupViews()
        getFavsByFilter("All")

        return root
    }

    /*
       override fun onRetryButtonClicked() {
           TODO("Not yet implemented")
       }

     */


    private fun getFavsByFilter(breadNameFilter: String) {
        viewModel.get().getFavorites(breadNameFilter)
        viewModel.get().response.removeObservers(viewLifecycleOwner)
        viewModel.get().response.observe(viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    if (it.isNullOrEmpty()) {
                        loadingErrorHelper.showError("no Favorites added ", false)
                    } else {
                        adapter?.updateDataSet(ArrayList(it))
                    }

                }

            }


        )
        viewModel.get().filterResponse.removeObservers(viewLifecycleOwner)

        viewModel.get().filterResponse.observe(
            viewLifecycleOwner,
            androidx.lifecycle.Observer { repos ->
                repos?.let {
                    Log.d("requestNow", "getFavsByFilter:  filter $it")
                    addFilterList(it)

                }

            })
    }

    private fun setupViews() {
        loadingErrorHelper = LoadingErrorHelper(mActivity!!, root, ::onRetryVuttonClicked)

        adapter = mActivity?.let { BreedImagesAdapter(it, ::onBreedsClickListener, arrayListOf()) }


        val layoutManager = GridLayoutManager(mActivity, 2)
        root.rv_images.layoutManager = layoutManager
        root.rv_images.adapter = adapter


    }

    private fun onRetryVuttonClicked() {
        viewModel.get().getFavorites("All")
    }

    fun addFilterList(filterList: List<String>) {
        if (filterAdapter == null) {
            if (filterList.isNullOrEmpty()) {
                return
            }
            if(filterList?.size>1) {
                (filterList as ArrayList).add(0, "All")
            }
            filterAdapter = ArrayAdapter<String>(
                mActivity!!,
                android.R.layout.simple_spinner_item,
                filterList
            )
            filterAdapter!!.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            root.sp_filter.onItemSelectedListener = this
            root.sp_filter.setAdapter(filterAdapter)
        }
    }


    private fun onBreedsClickListener(imageURl: String, view: View?) {
        Toast.makeText(mActivity, "clicked $imageURl ", Toast.LENGTH_SHORT).show()
        viewModel.get().favUnFave(imageURl)

    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        Toast.makeText(mActivity, "${p0?.getItemAtPosition(p2)}", Toast.LENGTH_LONG).show();
        getFavsByFilter(p0?.getItemAtPosition(p2).toString())


    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
    }
}


