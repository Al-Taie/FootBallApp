package com.watermelon.footballapp.utils

import android.view.View
import com.watermelon.footballapp.model.State
import java.text.SimpleDateFormat
import java.util.*

fun Date.convertToReadableTime(): String {
    val timeFormatter = SimpleDateFormat("HH:mm")
    return timeFormatter.format(this)
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
