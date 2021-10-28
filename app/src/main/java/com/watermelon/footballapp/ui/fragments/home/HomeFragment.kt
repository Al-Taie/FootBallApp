package com.watermelon.footballapp.ui.fragments.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.HomeViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun setup() {}

    override val viewModelID = BR.viewModel
    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

}