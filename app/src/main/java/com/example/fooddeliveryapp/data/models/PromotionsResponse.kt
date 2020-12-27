package com.example.fooddeliveryapp.data.remote

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class PromotionsResponse(


    @SerializedName("id")
    @Expose
    var id: Integer,

    @SerializedName("desc")
    @Expose
    var desc: String,

    @SerializedName("img_url")
    @Expose
    var img_url: String

)