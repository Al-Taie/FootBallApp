package com.watermelon.footballapp.ui.competition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import watermelon.footballapp.databinding.FragmentCompetitionBinding


class CompetitionFragment : BaseFragment<FragmentCompetitionBinding>() {
    override fun setup() {

    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentCompetitionBinding
        get() = FragmentCompetitionBinding::inflate

}