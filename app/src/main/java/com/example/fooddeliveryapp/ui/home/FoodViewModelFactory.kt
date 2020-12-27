package com.example.fooddeliveryapp.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.fooddeliveryapp.data.repositories.FoodRepository

@Suppress("UNCHECKED_CAST")
class FoodViewModelFactory(
    private val repository: FoodRepository
) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }

}