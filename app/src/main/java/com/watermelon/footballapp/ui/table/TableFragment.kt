package com.watermelon.footballapp.ui.table

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.adapter.CompetitionStandingAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.competition.CompetitionViewModel
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import watermelon.footballapp.databinding.FragmentTableBinding

class TableFragment : BaseFragment<FragmentTableBinding>() {
    override fun setup() {
        val adapter = CompetitionStandingAdapter(emptyList(), viewModel)
        binding.tableRecyclerView.adapter = adapter
    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTableBinding
        get() = FragmentTableBinding::inflate

}