package com.watermelon.footballapp.ui.scorers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.Constants
import watermelon.footballapp.databinding.FragmentScorersBinding

class ScorersFragment: BaseFragment<FragmentScorersBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionScorersById(this) }
        binding.scorersRecyclerView.adapter = CompetitionScorersAdapter(emptyList(), viewModel)
    }

    override val viewModel: ScorersViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentScorersBinding
        get() = FragmentScorersBinding::inflate

}