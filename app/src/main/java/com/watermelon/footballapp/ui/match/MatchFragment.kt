package com.watermelon.footballapp.ui.match

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentMatchBinding


class MatchFragment : BaseFragment<FragmentMatchBinding>() {
    override fun setup() {
        val args : MatchFragmentArgs by navArgs()
        viewModel.getMatchById(args.id)

        viewModel.competitionId.observe(this, EventObserver{
            navigateToCompetition(it)
        })

        viewModel.teamId.observe(this, EventObserver{
            navigateToTeam(it)
        })
    }

    private fun navigateToTeam(teamId: Int) {
        val action = MatchFragmentDirections.actionMatchFragmentToTeamFragment(teamId)
        findNavController().navigate(action)
    }

    private fun navigateToCompetition(competitionId : Int){
        val action = MatchFragmentDirections.actionMatchFragmentToCompetitionFragment(competitionId)
        findNavController().navigate(action)
    }

    override val viewModel: MatchViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchBinding
        get() = FragmentMatchBinding::inflate



}