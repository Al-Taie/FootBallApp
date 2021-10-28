package com.watermelon.footballapp.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyPagerAdapter(
    container: FragmentActivity,
    private val fragmentsList: List<Fragment>,
) : FragmentStateAdapter(container) {
    override fun getItemCount() = fragmentsList.size

    override fun createFragment(position: Int) = fragmentsList[position]

}