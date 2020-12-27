package com.example.fooddeliveryapp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.data.network.FoodApi
import com.example.fooddeliveryapp.data.repositories.FoodRepository
import com.google.android.material.slider.Slider
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment() {

    private lateinit var factory: FoodViewModelFactory
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val api = FoodApi()
        val repository = FoodRepository(api)

        factory = FoodViewModelFactory(repository)
        viewModel = ViewModelProviders.of(this, factory).get(MainViewModel::class.java)

        viewModel.getFood()

        var imageList = ArrayList<SlideModel>()

        viewModel.homeData.observe(viewLifecycleOwner, Observer { food ->
            recycler_food.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = FoodAdapter(food.categoriesResponse)

            }


            imageList.add(SlideModel(food.promotionsResponse.get(0).img_url,ScaleTypes.CENTER_CROP))
            imageList.add(SlideModel(food.promotionsResponse.get(1).img_url,ScaleTypes.CENTER_CROP))
            imageList.add(SlideModel(food.promotionsResponse.get(2).img_url,ScaleTypes.CENTER_CROP))

            image_slider.setImageList(imageList)


        })



    }






//    override fun onRecyclerViewItemClick(view: View, food: Movie) {
//        when(view.id){
//            R.id.button_book -> {
//                Toast.makeText(requireContext(), "Book Button Clicked", Toast.LENGTH_LONG).show()
//            }
//            R.id.layout_like ->{
//                Toast.makeText(requireContext(), "Like Layout Clicked", Toast.LENGTH_LONG).show()
//            }
//        }
//    }


}