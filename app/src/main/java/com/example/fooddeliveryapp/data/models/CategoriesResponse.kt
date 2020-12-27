package com.example.fooddeliveryapp.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoriesResponse(


    @SerializedName("title")
    @Expose
    var title: String,

    @SerializedName("details")
    @Expose
    var detail: ArrayList<CategoryDetailsResponse>


)