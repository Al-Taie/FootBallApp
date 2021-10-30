package com.watermelon.footballapp.ui.scorers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import watermelon.footballapp.databinding.FragmentScorersBinding

class ScorersFragment: BaseFragment<FragmentScorersBinding>() {
    override fun setup() {}

    override val viewModel: ScorersViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentScorersBinding
        get() = FragmentScorersBinding::inflate

}