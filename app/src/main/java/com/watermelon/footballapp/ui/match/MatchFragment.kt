package com.watermelon.footballapp.ui.match

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.ui.home.HomeViewModel
import watermelon.footballapp.databinding.FragmentMatchBinding


class MatchFragment : BaseFragment<FragmentMatchBinding>() {
    override fun setup() {
        val args : MatchFragmentArgs by navArgs()
        viewModel.makeRequest(args.id)
    }

    override val viewModel: MatchViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentMatchBinding
        get() = FragmentMatchBinding::inflate

}