package com.example.fooddeliveryapp.data.network

import com.example.fooddeliveryapp.data.remote.HomeResponse
import com.example.fooddeliveryapp.utils.AppConstants
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface FoodApi {

    @GET("9cd0f238")
    suspend fun getHome() : Response<HomeResponse>


    companion object{
        operator fun invoke() : FoodApi{
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(AppConstants.BASE_URL)
                .build()
                .create(FoodApi::class.java)
        }
    }

}