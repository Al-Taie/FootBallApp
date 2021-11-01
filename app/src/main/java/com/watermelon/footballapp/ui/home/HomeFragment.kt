package com.watermelon.footballapp.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.watermelon.footballapp.ui.adapter.MatchAdapter
import com.watermelon.footballapp.ui.base.BaseFragment
import kotlinx.coroutines.launch
import watermelon.footballapp.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>()  {

    override val viewModel: HomeViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    override fun setup() {
        binding.matchesRecycler.adapter = MatchAdapter(emptyList(), viewModel)
        binding.listener = viewModel
        lifecycleScope.launch {
            viewModel.singleMatchId.observe(this@HomeFragment, EventObserver<Int> { data ->
                navigateToMatch(data)
            })
        }
    }

    fun navigateToMatch(id: Int) {
        val action = HomeFragmentDirections.actionHomeFragmentToMatchFragment(id)
        findNavController().navigate(action)
    }



}