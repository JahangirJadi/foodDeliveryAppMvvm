package com.example.fooddeliveryapp.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class HomeResponse (

    @SerializedName("promotions")
    @Expose
    var promotionsResponse: List<PromotionsResponse>,

    @SerializedName("menu_list")
    @Expose
    var categoriesResponse: List<CategoryDetailsResponse>


)