package com.watermelon.footballapp.ui.competition

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CompetitionPagerAdapter(container: Fragment, private val fragmentsList: List<Fragment>) : FragmentStateAdapter(container) {
    override fun getItemCount() = fragmentsList.size

    override fun createFragment(position: Int) = fragmentsList[position]
}