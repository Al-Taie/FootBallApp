package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.match.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun setup() {
        binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
        viewModel.matchId.observe(this, EventObserver{ navigateToMatch(it) })
    }

    private fun navigateToMatch(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(id)
        findNavController().navigate(action)
    }

}