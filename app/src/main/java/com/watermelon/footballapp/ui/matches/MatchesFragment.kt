package com.watermelon.footballapp.ui.matches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import watermelon.footballapp.databinding.FragmentMatchesBinding

class MatchesFragment: BaseFragment<FragmentMatchesBinding>() {
    override fun setup() {}

    override val viewModel: MatchesViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchesBinding
        get() = FragmentMatchesBinding::inflate

}