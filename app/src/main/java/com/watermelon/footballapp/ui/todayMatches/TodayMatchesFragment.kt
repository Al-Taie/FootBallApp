package com.watermelon.footballapp.ui.todayMatches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.EventObserver
import watermelon.footballapp.databinding.FragmentTodayMatchesBinding


class TodayMatchesFragment : BaseFragment<FragmentTodayMatchesBinding>() {
    override val viewModel: TodayMatchesViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTodayMatchesBinding
        get() = FragmentTodayMatchesBinding::inflate

    override fun setup() {
        binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
        viewModel.matchId.observe(this, EventObserver{ navigateToMatch(it) })
    }

    private fun navigateToMatch(id: Int) {
        val action = TodayMatchesFragmentDirections.actionHomeFragmentToMatchFragment(id)
        findNavController().navigate(action)
    }

}