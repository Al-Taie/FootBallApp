package com.watermelon.footballapp.ui

import androidx.activity.viewModels
import com.watermelon.footballapp.ui.base.BaseActivity
import com.watermelon.footballapp.viewModels.MainViewModel
import watermelon.footballapp.R
import watermelon.footballapp.databinding.ActivityMainBinding
import watermelon.footballapp.BR

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val theme = R.style.Theme_FootBallApp
    override val viewID = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()
    override val viewModelID = BR.viewModel

    override fun setup() {}

}