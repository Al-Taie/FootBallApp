package com.watermelon.footballapp.ui

import androidx.activity.viewModels
import androidx.navigation.findNavController
import com.watermelon.footballapp.ui.base.BaseActivity
import com.watermelon.footballapp.utils.onNavDestinationSelected
import com.watermelon.footballapp.viewModels.MainViewModel
import watermelon.footballapp.R
import watermelon.footballapp.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override val theme = R.style.Theme_FootBallApp
    override val viewID = R.layout.activity_main
    override val viewModel: MainViewModel by viewModels()

    override fun setup() {

    }

    override fun onResume() {
        super.onResume()
        val navController = findNavController(R.id.fragment_container_host)

        binding.bottomNavigation.addBubbleListener { id ->
            onNavDestinationSelected(id , navController)
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            binding.bottomNavigation.setSelectedWithId(destination.id, false)
        }
    }

}