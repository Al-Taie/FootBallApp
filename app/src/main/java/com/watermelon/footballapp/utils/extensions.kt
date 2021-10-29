package com.watermelon.footballapp.utils

import java.text.SimpleDateFormat
import java.util.*

fun Date.convertToReadableTime(): String {
    val timeFormatter = SimpleDateFormat("HH:mm")
    return timeFormatter.format(this)
}