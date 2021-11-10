package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentHomeBinding
import watermelon.footballapp.databinding.FragmentMatchBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun setup() {
        viewModel.teamId.observe(this, EventObserver{
            navigateToTeam(it)
        })

        viewModel.competitionId.observe(this, EventObserver{
            navigateToCompetition(it)
        })
    }

    private fun navigateToCompetition(competitionId: Int) {
        val action = HomeFragmentDirections.actionHomeFragment2ToCompetitionFragment(competitionId)
        findNavController().navigate(action)
    }

    private fun navigateToTeam(teamId: Int) {
        val action = HomeFragmentDirections.actionHomeFragment2ToTeamFragment(teamId)
        findNavController().navigate(action)
    }

    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate




}