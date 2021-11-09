package com.watermelon.footballapp.ui.matches

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionFragment
import com.watermelon.footballapp.utils.Constants
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentMatchesBinding

class MatchesFragment : BaseFragment<FragmentMatchesBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionMatchesById(this) }
        binding.matchesRecycler.adapter = CompetitionMatchAdapter(emptyList(), viewModel)

        viewModel.matchId.observe(this, EventObserver{
            navigateToMatch(it)
        })
    }

    private fun navigateToMatch(matchId : Int) {
        val bundle = Bundle().apply { putInt("matchId",matchId) }
        val competitionFragment = CompetitionFragment()
//        competitionFragment.arguments = bundle
        competitionFragment.navigateToMatch()

    }



    override val viewModel: MatchesViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchesBinding
        get() = FragmentMatchesBinding::inflate
}