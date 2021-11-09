package com.watermelon.footballapp.ui.matches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.Constants
import watermelon.footballapp.databinding.FragmentMatchesBinding

class MatchesFragment : BaseFragment<FragmentMatchesBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionMatchesById(this) }
        binding.matchesRecycler.adapter = CompetitionMatchAdapter(emptyList(), viewModel)
    }

    override val viewModel: MatchesViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchesBinding
        get() = FragmentMatchesBinding::inflate
}