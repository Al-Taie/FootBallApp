package com.watermelon.footballapp.ui.competitionList

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentCompetitionListBinding

class CompetitionListFragment: BaseFragment<FragmentCompetitionListBinding>() {
    override fun setup() {
        binding.competitionRecycler.adapter = CompetitionListAdapter(emptyList(), viewModel)

        viewModel.competitionId.observe(this, EventObserver{
            navigateToCompetition(it)
        })
    }

    private fun navigateToCompetition(competitionId: Int) {
        val action = CompetitionListFragmentDirections.actionCompetitionListFragmentToCompetitionFragment(competitionId)
        findNavController().navigate(action)
    }

    override val viewModel: CompetitionListViewModel by viewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentCompetitionListBinding
        get() = FragmentCompetitionListBinding::inflate
}