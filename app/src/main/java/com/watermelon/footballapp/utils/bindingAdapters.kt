package com.watermelon.footballapp.utils

import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.watermelon.footballapp.ui.base.BaseAdapter

@BindingAdapter(value = ["app:items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    (view.adapter as BaseAdapter<T>?)?.setItems(items ?: emptyList())
    Log.v("MAIN_ACTIVITY", items.toString())
}
