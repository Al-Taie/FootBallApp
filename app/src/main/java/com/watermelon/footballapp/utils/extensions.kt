package com.watermelon.footballapp.utils

import android.view.View
import androidx.navigation.ActivityNavigator
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import com.watermelon.footballapp.model.State
import watermelon.footballapp.R
import java.text.SimpleDateFormat
import java.util.*

fun Date.convertToReadableTime(): String {
    val timeFormatter = SimpleDateFormat("HH:mm")
    return timeFormatter.format(this)
}

fun Date.setDate(): String {
    val dateFormatter = SimpleDateFormat("yyyy-MM-dd")
    return dateFormatter.format(this)
}

fun <T> View.handleErrorState(state: State<T>?) = if (state is State.Error) {
    this.visibility = View.VISIBLE
} else {
    this.visibility = View.GONE
}

fun <T> View.handleLoadingState(state: State<T>?) = if (state is State.Loading) {
    this.visibility = View.VISIBLE
} else {
    this.visibility = View.GONE
}

fun <T> View.handleSuccessState(state: State<T>?) = if (state is State.Success) {
    this.visibility = View.VISIBLE
} else {
    this.visibility = View.GONE
}

fun onNavDestinationSelected(
    itemId: Int,
    navController: NavController
): Boolean {
    val builder = NavOptions.Builder()
        .setLaunchSingleTop(true)
    if (navController.currentDestination!!.parent!!.findNode(itemId) is ActivityNavigator.Destination) {
        builder.setEnterAnim(R.anim.nav_default_enter_anim)
            .setExitAnim(R.anim.nav_default_exit_anim)
            .setPopEnterAnim(R.anim.nav_default_pop_enter_anim)
            .setPopExitAnim(R.anim.nav_default_pop_exit_anim)
    } else {
        builder.setEnterAnim(R.animator.nav_default_enter_anim)
            .setExitAnim(R.animator.nav_default_exit_anim)
            .setPopEnterAnim(R.animator.nav_default_pop_enter_anim)
            .setPopExitAnim(R.animator.nav_default_pop_exit_anim)
    }
    //if (itemId == getChildAt(0).id) {
    //builder.setPopUpTo(findStartDestination(navController.graph)!!.id, true)
    // }
    builder.setPopUpTo(itemId, true)
    val options = builder.build()
    return try {

        navController.navigate(itemId, null, options)
        true
    } catch (e: IllegalArgumentException) {
        false
    }
}
