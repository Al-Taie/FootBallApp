package com.watermelon.footballapp.ui.competition

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.tabs.TabLayoutMediator
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.matches.MatchesFragment
import com.watermelon.footballapp.ui.scorers.ScorersFragment
import com.watermelon.footballapp.ui.table.TableFragment
import com.watermelon.footballapp.utils.Constants
import watermelon.footballapp.R
import watermelon.footballapp.databinding.FragmentCompetitionBinding


class CompetitionFragment : BaseFragment<FragmentCompetitionBinding>() {
    private val args: CompetitionFragmentArgs by navArgs()

    override fun setup() {
        viewModel.getCompetitionById(args.id)
        initViewPager()
        initTabLayout()
        callBacks()
    }

    private fun initTabLayout() {
        val tabTitles = listOf("Matches", "Table", "Scorers")
        TabLayoutMediator(binding.tabLayout, binding.rankingViewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }

    private fun initViewPager() {
        val bundle = Bundle().apply { putInt(Constants.ID, args.id) }
        val fragmentList = listOf(
            MatchesFragment(),
            TableFragment(),
            ScorersFragment()
        ).map { it.apply { arguments = bundle } }

        binding.rankingViewPager.adapter = CompetitionPagerAdapter(this, fragmentList)
    }

    private fun callBacks() {
        binding.backButton.setOnClickListener { view ->
            view.findNavController().popBackStack(R.id.homeFragment, false)
        }
    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentCompetitionBinding
        get() = FragmentCompetitionBinding::inflate

}