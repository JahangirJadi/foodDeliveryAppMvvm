package com.example.fooddeliveryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.DiffUtil

import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.data.remote.CategoriesResponse
import com.example.fooddeliveryapp.data.remote.CategoryDetailsResponse
import com.example.fooddeliveryapp.databinding.ItemFoodBinding
import com.example.fooddeliveryapp.viewHolder.FoodViewHolder

class FoodItemsRecyclerAdapter(context: Context) :
    androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>() {

    private var list: ArrayList<CategoryDetailsResponse> = ArrayList()
//    private val ITEM_TYPE_TITLE = 1
//    private val ITEM_TYPE_ITEM = 2
//    private var listener: ItemTouchListener
//
//    init {
//        listener = context as ItemTouchListener
//    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): androidx.recyclerview.widget.RecyclerView.ViewHolder {
            val mUserBinding: ItemFoodBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.context), R.layout.item_food, parent, false)
        return FoodViewHolder(mUserBinding)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: androidx.recyclerview.widget.RecyclerView.ViewHolder, position: Int) {

//        var clickListener: View.OnClickListener = View.OnClickListener {
//            listener.onItemClick(list[holder.adapterPosition])
//        }


                holder as FoodViewHolder
                holder.setFood(list[position])


    }

    fun setList(newList: ArrayList<CategoryDetailsResponse>) {

        list.clear()
        list.addAll(newList)
    }

//    fun setList(newList: ArrayList<User>) {
//        val diffResult = DiffUtil.calculateDiff(UserDiffUtil(newList, list))
//        diffResult.dispatchUpdatesTo(this)
//        list.clear()
//        list.addAll(newList)
//    }
//
//    private fun getLoaderItem(): User {
//        return User(
//            id = 0,
//            name = Name(),
//            picture = Picture(),
//            location = Location(),
//            email = "",
//            dob = Dob(),
//            cell = "",
//            gender = ""
//        )
//    }

    fun getItem(position: Int): CategoryDetailsResponse {
        return list[position]
    }


}