package com.watermelon.footballapp.ui.team

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentTeamBinding

class TeamFragment : BaseFragment<FragmentTeamBinding>() {

    override fun setup() {
        binding.matchesRecycler.adapter = TeamMatchAdapter(emptyList(), viewModel)
        val args: TeamFragmentArgs by navArgs()
        viewModel.getTeamAndTeamMatchesById(args.id)

        viewModel.matchId.observe(this, EventObserver{
            navigateToMatch(it)
        })
    }

    private fun navigateToMatch(matchId: Int) {
        val action = TeamFragmentDirections.actionTeamFragmentToMatchFragment(matchId)
        findNavController().navigate(action)
    }


    override val viewModel: TeamViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTeamBinding
        get() = FragmentTeamBinding::inflate

}