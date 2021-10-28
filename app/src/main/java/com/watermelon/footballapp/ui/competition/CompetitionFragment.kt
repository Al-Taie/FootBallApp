package com.watermelon.footballapp.ui.competition

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.CompetitionViewModel
import com.watermelon.footballapp.viewModels.MatchViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentCompetitionBinding
import watermelon.footballapp.databinding.FragmentMatchBinding


class CompetitionFragment : BaseFragment<FragmentCompetitionBinding>() {
    override fun setup() {

    }

    override val viewModel: CompetitionViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentCompetitionBinding
        get() = FragmentCompetitionBinding::inflate

}