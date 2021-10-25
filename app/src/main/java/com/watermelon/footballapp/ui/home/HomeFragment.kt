package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.HomeViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.HomeFragmentBinding


class HomeFragment : BaseFragment<HomeFragmentBinding>() {
    override fun setup() {}

    override val viewModelID = BR.viewModel
    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> HomeFragmentBinding
        get() = HomeFragmentBinding::inflate

}