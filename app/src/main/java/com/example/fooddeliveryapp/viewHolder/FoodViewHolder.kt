package com.example.fooddeliveryapp.viewHolder

import androidx.recyclerview.widget.RecyclerView
import com.example.fooddeliveryapp.data.remote.CategoryDetailsResponse

class FoodViewHolder(var mFoodBinding: com.example.fooddeliveryapp.databinding.ItemFoodBinding) :

    RecyclerView.ViewHolder(mFoodBinding.root) {

    fun setFood(food: CategoryDetailsResponse) {
        mFoodBinding.food = food
    }
}