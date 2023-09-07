package com.example.flowexample.dogbreed.presentation.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.RoundedCorner
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.flowexample.R
import kotlinx.android.synthetic.main.fav_fragment.view.*
import kotlinx.android.synthetic.main.viewholder_breed.view.*

class BreedImagesAdapter(
    private val mcontext: Context,
    val onClickBreed: (breedsName: String, view: View?) -> Unit,
    val images: ArrayList<String>
) :
    RecyclerView.Adapter<BreedImagesAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.viewholder_breed_image, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        holder.bindData(images[position])

    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return images.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var breedImage: ImageView? = null

        init {
            breedImage = itemView.findViewById(R.id.iv_breedImage)
        }

        fun bindData(imageUrl: String) {
val requestOptions =RequestOptions().transform(CenterCrop(),RoundedCorners(mcontext.resources.getDimensionPixelSize(R.dimen.cardview_default_radius)))
            breedImage?.let {
                Glide.with(mcontext)
                    .load(imageUrl)

                    .apply(requestOptions)
                    .into(it)
            };
            breedImage?.setOnClickListener {
                onClickBreed(imageUrl, it)
            }
        }


    }

    fun updateDataSet(breedsUpdated: ArrayList<String>) {
        images.clear()
        images.addAll(breedsUpdated)
        notifyDataSetChanged()


    }

}