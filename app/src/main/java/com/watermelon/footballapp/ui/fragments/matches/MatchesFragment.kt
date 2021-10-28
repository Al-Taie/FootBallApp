package com.watermelon.footballapp.ui.fragments.matches

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.MatchesViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentMatchesBinding

class MatchesFragment: BaseFragment<FragmentMatchesBinding>() {
    override fun setup() {

    }

    override val viewModelID = BR.viewModel
    override val viewModel: MatchesViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchesBinding
        get() = FragmentMatchesBinding::inflate

}