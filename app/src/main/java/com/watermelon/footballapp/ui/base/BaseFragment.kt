package com.watermelon.footballapp.ui.base

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.watermelon.footballapp.ui.MainActivity
import watermelon.footballapp.BR

abstract class BaseFragment<VDB : ViewDataBinding, VM : BaseViewModel> : Fragment() {
    abstract fun setup()

    private lateinit var _viewModel: BaseViewModel
    protected val viewModel: VM
        get() = _viewModel as VM

    abstract fun getVM(): VM

    abstract val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> VDB
    private lateinit var _binding: VDB
    protected val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = inflate(inflater, container, false)
        _viewModel = getVM()
        _binding.setVariable(BR.viewModel, viewModel)
        _binding.lifecycleOwner = this
        setup()
        return _binding.root
    }
}