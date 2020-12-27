package com.example.fooddeliveryapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.data.remote.CategoryDetailsResponse
import com.example.fooddeliveryapp.databinding.ItemFoodBinding
import com.example.fooddeliveryapp.viewHolder.FoodViewHolder

class FoodAdapter(

    private val foodList: List<CategoryDetailsResponse>

) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
//    private val listener: RecyclerViewClickListener
//    ) :


    override fun getItemCount() = foodList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        FoodViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_food,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.recyclerviewFoodBinding.food = foodList[position]
//            holder.recyclerviewFoodBinding.buttonBook.setOnClickListener {
//                listener.onRecyclerViewItemClick(holder.recyclerviewMovieBinding.buttonBook, movies[position])
//            }
//            holder.recyclerviewMovieBinding.layoutLike.setOnClickListener {
//                listener.onRecyclerViewItemClick(holder.recyclerviewMovieBinding.layoutLike, movies[position])
//            }
    }


    inner class FoodViewHolder(
        val recyclerviewFoodBinding: ItemFoodBinding
    ) : RecyclerView.ViewHolder(recyclerviewFoodBinding.root)

}