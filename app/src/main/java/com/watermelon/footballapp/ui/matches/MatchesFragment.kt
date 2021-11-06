package com.watermelon.footballapp.ui.matches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.watermelon.footballapp.ui.adapter.CompetitionMatchAdapter
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionViewModel
import com.watermelon.footballapp.ui.home.HomeFragmentDirections
import watermelon.footballapp.databinding.FragmentMatchesBinding

class MatchesFragment: BaseFragment<FragmentMatchesBinding>(),MatchesNavigator {
    override fun setup() {
        binding.matchesRecycler.adapter = CompetitionMatchAdapter(emptyList(), viewModel)
    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchesBinding
        get() = FragmentMatchesBinding::inflate

    override fun navigateToMatch(id: Int) {}

}