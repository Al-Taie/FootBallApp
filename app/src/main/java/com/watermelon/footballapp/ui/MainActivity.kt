package com.watermelon.footballapp.ui

import androidx.activity.viewModels
import com.watermelon.footballapp.ui.base.BaseActivity
import com.watermelon.footballapp.viewModels.MainViewModel
import watermelon.footballapp.R
import watermelon.footballapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val theme = R.style.Theme_FootBallApp
    override val viewID = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()
    //TODO : uncomment to check ui
//    private val fragments = listOf(MatchesFragment(), TableFragment(), MatchFragment(),HomeFragment())
//    private val tabTitles = listOf("Matches", "Table","karrar1","karrar2")

    override fun setup() {
//        initViewPager()
//        initTabLayout()
    }

//    private fun initTabLayout() {
//        TabLayoutMediator(binding.tabLayout, binding.rankingViewPager) { tab, position ->
//            tab.text = tabTitles[position]
//        }.attach()
//    }
//
//    private fun initViewPager() {
//        val pagerAdapter = MyPagerAdapter(this, fragments)
//        binding.rankingViewPager.adapter = pagerAdapter
//    }
}