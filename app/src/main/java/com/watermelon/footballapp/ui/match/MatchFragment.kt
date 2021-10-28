package com.watermelon.footballapp.ui.match

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.MatchViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentMatchBinding


class MatchFragment : BaseFragment<FragmentMatchBinding>() {
    override fun setup() {

    }

    override val viewModelID = BR.viewModel
    override val viewModel: MatchViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchBinding
        get() = FragmentMatchBinding::inflate

}