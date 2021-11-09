package com.watermelon.footballapp.ui.scorers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionFragmentDirections
import com.watermelon.footballapp.utils.Constants
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentScorersBinding

class ScorersFragment: BaseFragment<FragmentScorersBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionScorersById(this) }
        binding.scorersRecyclerView.adapter = CompetitionScorersAdapter(emptyList(), viewModel)

        viewModel.playerId.observe(this, EventObserver{
            navigateToPlayer(it)
        })
    }

    private fun navigateToPlayer(playerId: Int) {
        val action = CompetitionFragmentDirections.actionCompetitionFragmentToPlayerFragment(playerId)
        findNavController().navigate(action)
    }

    override val viewModel: ScorersViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentScorersBinding
        get() = FragmentScorersBinding::inflate

}