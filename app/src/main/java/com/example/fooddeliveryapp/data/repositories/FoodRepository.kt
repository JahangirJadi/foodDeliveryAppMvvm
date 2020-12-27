package com.example.fooddeliveryapp.data.repositories

import com.example.fooddeliveryapp.data.network.FoodApi

class FoodRepository (
    private val api : FoodApi
) : SafeApiRequest(){
    suspend fun getFood() = apiRequest { api.getHome() }
}