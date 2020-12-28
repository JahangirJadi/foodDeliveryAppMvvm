package com.example.fooddeliveryapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity
data class DatabaseCartItem constructor(
    @PrimaryKey(autoGenerate = true)
    var id: Int,

    var menu_id: Int,

    var price: Int,

    var menu_title: String,

    var size: String,

    var description: String,

    var img_url: String
)