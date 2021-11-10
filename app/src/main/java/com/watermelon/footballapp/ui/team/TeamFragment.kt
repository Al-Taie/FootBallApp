package com.watermelon.footballapp.ui.team

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.matches.CompetitionMatchAdapter
import watermelon.footballapp.databinding.FragmentTeamBinding

class TeamFragment : BaseFragment<FragmentTeamBinding>() {

    override fun setup() {
        val args: TeamFragmentArgs by navArgs()
        viewModel.makeRequest(args.id)
        binding.matchesRecycler.adapter = TeamMatchAdapter(emptyList(), viewModel)
    }



    override val viewModel: TeamViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTeamBinding
        get() = FragmentTeamBinding::inflate

}