package com.watermelon.footballapp.ui.competition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.google.android.material.tabs.TabLayoutMediator
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.matches.MatchesFragment
import com.watermelon.footballapp.ui.table.TableFragment
import watermelon.footballapp.databinding.FragmentCompetitionBinding


class CompetitionFragment : BaseFragment<FragmentCompetitionBinding>() {

    private val fragmentList = listOf( MatchesFragment(), TableFragment())
    private val tabTitles = listOf("Matches", "Table")

    override fun setup() {
        val args : CompetitionFragmentArgs by navArgs()
        viewModel.getCompetitionMatchesById(args.id)
        viewModel.getCompetitionById(args.id)
        initViewPager()
        initTabLayout()
    }

    private fun initTabLayout() {
        TabLayoutMediator(binding.tabLayout, binding.rankingViewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

    private fun initViewPager() {
        val adapter = CompetitionPagerAdapter(this, fragmentList)
        binding.rankingViewPager.adapter = adapter
    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentCompetitionBinding
        get() = FragmentCompetitionBinding::inflate

}