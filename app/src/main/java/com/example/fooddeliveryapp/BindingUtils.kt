package com.example.fooddeliveryapp

import androidx.appcompat.widget.AppCompatImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel
import com.example.fooddeliveryapp.adapter.FoodItemsRecyclerAdapter
import com.example.fooddeliveryapp.data.remote.CategoryDetailsResponse

import com.example.fooddeliveryapp.data.remote.PromotionsResponse
import com.makeramen.roundedimageview.RoundedImageView

object BindingUtils {
    @JvmStatic
    @BindingAdapter("app:imageUrl")
    fun loadImage(view: RoundedImageView, url: String) {
        Glide.with(view.context)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
            .into(view)
    }

    @BindingAdapter("list")
    fun bindFoodRecyclerView(recyclerView: RecyclerView, data: ArrayList<CategoryDetailsResponse>?) {
        val adapter = recyclerView.adapter as FoodItemsRecyclerAdapter
        data?.let {
            adapter.setList(data)
        }
    }

}