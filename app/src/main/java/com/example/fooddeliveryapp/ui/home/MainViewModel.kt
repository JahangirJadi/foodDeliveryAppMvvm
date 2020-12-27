package com.example.fooddeliveryapp.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fooddeliveryapp.data.remote.CategoriesResponse
import com.example.fooddeliveryapp.data.remote.HomeResponse
import com.example.fooddeliveryapp.data.repositories.FoodRepository
import com.example.fooddeliveryapp.utils.Coroutines
import com.google.gson.GsonBuilder
import kotlinx.coroutines.Job
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel(
    private val repository: FoodRepository
) : ViewModel() {

   private lateinit var job:Job

    private val _homeDate = MutableLiveData<HomeResponse>()
    val homeData : LiveData<HomeResponse>
    get() = _homeDate

    fun getFood(){
        job = Coroutines.ioThenMain(
            {repository.getFood()},
            {
                _homeDate.value = it
            }
        )
    }

    override fun onCleared() {
        super.onCleared()
        if (::job.isInitialized)job.cancel()
    }
}