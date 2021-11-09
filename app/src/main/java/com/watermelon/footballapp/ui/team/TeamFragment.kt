package com.watermelon.footballapp.ui.team

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.google.android.material.tabs.TabLayoutMediator
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionPagerAdapter
import com.watermelon.footballapp.ui.match.MatchFragment
import com.watermelon.footballapp.ui.match.MatchFragmentArgs
import com.watermelon.footballapp.ui.matches.MatchesFragment
import com.watermelon.footballapp.ui.table.TableFragment
import watermelon.footballapp.databinding.FragmentTeamBinding

class TeamFragment: BaseFragment<FragmentTeamBinding>() {
    private val fragmentList = listOf( TeamDetailsFragment(), MatchesFragment())
    private val tabTitles = listOf("Team Details", "Matches")

    override fun setup() {
        viewModel.makeRequest(80)
        initViewPager()
        initTabLayout()
    }
    private fun initTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.teamViewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

    private fun initViewPager() {
        val adapter = CompetitionPagerAdapter(this, fragmentList)
        binding.teamViewPager.adapter = adapter
    }
    override val viewModel: TeamViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTeamBinding
        get() = FragmentTeamBinding::inflate

}