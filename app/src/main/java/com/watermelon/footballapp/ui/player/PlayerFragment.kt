package com.watermelon.footballapp.ui.player

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import watermelon.footballapp.databinding.FragmentPlayerBinding

class PlayerFragment: BaseFragment<FragmentPlayerBinding>() {
    override fun setup() {}

    override val viewModel: PlayerViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentPlayerBinding
        get() = FragmentPlayerBinding::inflate

}