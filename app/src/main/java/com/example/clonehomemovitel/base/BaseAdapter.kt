package com.example.clonehomemovitel.base

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.clonehomemovitel.utils.CollectionUtils

abstract class BaseAdapter<T, VH : RecyclerView.ViewHolder> : RecyclerView.Adapter<VH>() {
    open val ITEM_EMPTY = -1
    open val ITEM_NORMAL = 0

    open val enableDiffUtil = false
    open fun compareDiffUtil(oldItem: T, newItem: T): Boolean = oldItem == newItem

    var items = mutableListOf<T>()
    override fun getItemId(position: Int): Long {
        val item = getItem(position)
        return item?.hashCode()?.toLong() ?: System.currentTimeMillis()
    }

    fun getItem(position: Int): T? {
        return if (position in 0 until itemCount) items[position] else null
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return if (item == null) ITEM_EMPTY else ITEM_NORMAL
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun updateItems(list: ArrayList<T>?) {
        if (enableDiffUtil) {
            if (CollectionUtils.isNotEmpty(list)) {
                notifyWithDiffUtil(items, list!!) {
                    items.clear()
                    items.addAll(list)
                    notifyDataSetChanged()
                }
            } else {
                items.clear()
                notifyDataSetChanged()
            }
        } else {
            items.clear()
            if (CollectionUtils.isNotEmpty(list)) items.addAll(list!!)
            notifyDataSetChanged()
        }
    }

    fun updateItems(list: List<T>?) {
        if (enableDiffUtil) {
            if (CollectionUtils.isNotEmpty(list)) {
                notifyWithDiffUtil(items, ArrayList(list!!)) {
                    items.clear()
                    items.addAll(list)
                    notifyDataSetChanged()
                }
            } else {
                items.clear()
                notifyDataSetChanged()
            }
        } else {
            items.clear()
            if (CollectionUtils.isNotEmpty(list)) items.addAll(list!!)
            notifyDataSetChanged()
        }
    }

    fun addItem(item: T) {
        items.add(item)
        notifyItemInserted(itemCount - 1)
    }

    fun removeItem(position: Int) {
        items.removeAt(position)
        notifyItemRangeChanged(position, itemCount - 1)
    }

    private fun notifyWithDiffUtil(oldItems: List<T>, newItems: List<T>, updateData: () -> Unit) {
        val diff = DiffUtil.calculateDiff(object : DiffUtil.Callback() {

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                val result = compareDiffUtil(oldItems[oldItemPosition], newItems[newItemPosition])
                //Log.i("areItemsTheSame $oldItemPosition vs $newItemPosition: $result")
                return result
            }

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                val result = oldItems[oldItemPosition]?.equals(newItems[newItemPosition]) ?: false
                //Log.i("areContentsTheSame $oldItemPosition vs $newItemPosition: $result")
                return result
            }

            override fun getOldListSize() = oldItems.size

            override fun getNewListSize() = newItems.size

        })
        updateData()
        diff.dispatchUpdatesTo(this)
    }
}