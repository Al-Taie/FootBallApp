package com.watermelon.footballapp.ui.table

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionFragmentDirections
import com.watermelon.footballapp.utils.Constants
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentTableBinding

class TableFragment : BaseFragment<FragmentTableBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionStandingById(this) }
        binding.tableRecyclerView.adapter = CompetitionStandingAdapter(emptyList(), viewModel)

        viewModel.teamId.observe(this, EventObserver{
            navigateToTeam(it)
        })
    }

    private fun navigateToTeam(teamId: Int) {
        val action = CompetitionFragmentDirections.actionCompetitionFragmentToTeamFragment(teamId)
        findNavController().navigate(action)
    }

    override val viewModel: TableViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTableBinding
        get() = FragmentTableBinding::inflate

}