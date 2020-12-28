package com.example.fooddeliveryapp.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliveryapp.data.remote.CategoryDetailsResponse
import com.example.fooddeliveryapp.databinding.ItemFoodBinding

class FoodViewHolder(var mFoodBinding: ItemFoodBinding) :

    RecyclerView.ViewHolder(mFoodBinding.root) {

    fun setFood(food: CategoryDetailsResponse) {
        mFoodBinding.food = food
    }
}