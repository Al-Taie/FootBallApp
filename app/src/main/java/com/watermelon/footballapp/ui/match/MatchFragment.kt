package com.watermelon.footballapp.ui.match

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.home.HomeViewModel
import com.watermelon.footballapp.ui.matches.MatchesFragmentDirections
import com.watermelon.footballapp.ui.team.TeamNavigator
import watermelon.footballapp.databinding.FragmentMatchBinding


class MatchFragment : BaseFragment<FragmentMatchBinding>(),MatchNavigator {
    override fun setup() {
        viewModel.navigator = this
        val args : MatchFragmentArgs by navArgs()
        viewModel.makeRequest(args.id)
    }

    override val viewModel: MatchViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchBinding
        get() = FragmentMatchBinding::inflate

    override fun navigateToTeam(id: Int) {
        val action = MatchesFragmentDirections.actionMatchesFragmentToMatchFragment(id)
        Navigation.findNavController(binding.root)
            .navigate(action)
    }

}