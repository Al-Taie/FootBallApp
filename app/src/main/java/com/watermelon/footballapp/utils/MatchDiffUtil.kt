package com.watermelon.footballapp.utils

import androidx.recyclerview.widget.DiffUtil

class MatchDiffUtil<T>(private val oldList: List<T>, private val newList: List<T>): DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return true
    }
}