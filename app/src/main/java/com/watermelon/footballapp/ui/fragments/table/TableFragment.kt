package com.watermelon.footballapp.ui.fragments.table

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.watermelon.footballapp.ui.base.BaseFragment
import com.watermelon.footballapp.viewModels.TableViewModel
import watermelon.footballapp.BR
import watermelon.footballapp.databinding.FragmentTableBinding

class TableFragment : BaseFragment<FragmentTableBinding>() {
    override fun setup() {

    }

    override val viewModelID = BR.viewModel
    override val viewModel: TableViewModel by activityViewModels()
    override val inflate: (LayoutInflater, ViewGroup?, attachToRoot: Boolean) -> FragmentTableBinding
        get() = FragmentTableBinding::inflate

}