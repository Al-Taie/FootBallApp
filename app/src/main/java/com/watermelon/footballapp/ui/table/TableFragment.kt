package com.watermelon.footballapp.ui.table

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.adapter.CompetitionStandingAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.utils.Constants
import watermelon.footballapp.databinding.FragmentTableBinding

class TableFragment : BaseFragment<FragmentTableBinding>() {
    override fun setup() {
        arguments?.getInt(Constants.ID)?.run { viewModel.getCompetitionStandingById(this) }
        binding.tableRecyclerView.adapter = CompetitionStandingAdapter(emptyList(), viewModel)
    }

    override val viewModel: TableViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTableBinding
        get() = FragmentTableBinding::inflate

}