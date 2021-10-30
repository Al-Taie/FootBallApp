package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.match.MatchInteractionListener
import com.watermelon.footballapp.viewModels.HomeViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.R
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(), HomeNavigator {

    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun setup() {
        binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
        viewModel.navigator = this

    }

    override fun navigateToMatch() {
        Navigation.findNavController(binding.root)
            .navigate(R.id.action_homeFragment_to_matchFragment)
    }

}