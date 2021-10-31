package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.matches.MatchesFragmentDirections
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeNavigator {

    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun setup() {
        binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
        viewModel.navigator = this

    }

    override fun navigateToMatch(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(id)
        findNavController().navigate(action)
    }

    override fun navigateToTeam(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToTeamFragment(id)
        findNavController().navigate(action)
    }

}