package com.watermelon.footballapp.ui

import androidx.activity.viewModels
import com.watermelon.footballapp.ui.base.BaseActivity
import com.watermelon.footballapp.viewModels.HomeViewModel
import watermelon.footballapp.R
import watermelon.footballapp.databinding.ActivityHomeBinding
import watermelon.footballapp.BR

class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    override val theme = R.style.Theme_FootBallApp
    override val viewID = R.layout.activity_home
    override val viewModel: HomeViewModel by viewModels()
    override val viewModelID = BR.viewModel

    override fun setup() {}

}