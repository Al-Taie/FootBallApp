package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.viewModels.HomeViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override fun setup() {
       binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
    }

    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

}