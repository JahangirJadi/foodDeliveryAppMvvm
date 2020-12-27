package com.example.fooddeliveryapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.fooddeliveryapp.R
import com.example.fooddeliveryapp.data.remote.CategoriesResponse

class PagerAdapter(
    fm: FragmentManager,
    private val pages: List<Fragment>, private val categoriesResponse: List<CategoriesResponse>
) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = pages[position]

    override fun getCount(): Int = pages.size

    override fun getPageTitle(position: Int): CharSequence? {
        return categoriesResponse.get(position).title

    }

    fun getTabView(position: Int, context: Context): View? {
        // Given you have a custom layout in `res/layout/custom_tab.xml` with a TextView and ImageView

        val v: View = LayoutInflater.from(context)
            .inflate(R.layout.custom_tab_view, null)
        val tv = v.findViewById<TextView>(R.id.txtView)
        tv.text = categoriesResponse.get(position).title
        return v
    }


}