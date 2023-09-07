package com.example.flowexample.breedsList.presentation.ui.adapters


import android.content.Context


import androidx.recyclerview.widget.RecyclerView

import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import com.example.flowexample.R
import kotlinx.android.synthetic.main.viewholder_breed.view.*


class BreedsAdapter(
    private val mcontext: Context,
    val onClickBreed: (breedsName: String, view: View?) -> Unit,
    val breeds: ArrayList<String>
) :
    RecyclerView.Adapter<BreedsAdapter.RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        // Inflate Layout
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.viewholder_breed, parent, false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        // Set the data to textview and imageview.
        holder.bindData(breeds[position])

    }

    override fun getItemCount(): Int {
        // this method returns the size of recyclerview
        return breeds.size
    }

    // View Holder Class to handle Recycler View.
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindData(breedsName: String) {
itemView.tv_name.text=breedsName
            itemView.setOnClickListener {
                onClickBreed(breedsName, it)
            }
        }



    }
    fun updateDataSet( breedsUpdated: ArrayList<String>){
        breeds.clear()
        breeds.addAll(breedsUpdated)
        notifyDataSetChanged()
    }

}