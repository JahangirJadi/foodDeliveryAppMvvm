package com.example.fooddeliveryapp.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoryDetailsResponse(

    @SerializedName("menu_id")
    @Expose
    var menu_id: Integer,

    @SerializedName("price")
    @Expose
    var price: Integer,

    @SerializedName("menu_title")
    @Expose
    var menu_title: String,


    @SerializedName("size")
    @Expose
    var size: String,

    @SerializedName("description")
    @Expose
    var description: String,


    @SerializedName("img_url")
    @Expose
    var img_url: String


)