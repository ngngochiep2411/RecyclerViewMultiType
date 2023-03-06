package com.example.clonehomemovitel.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.clonehomemovitel.R
import com.example.clonehomemovitel.base.BaseBindingAdapter
import com.example.clonehomemovitel.base.BaseBindingViewHolder
import com.example.clonehomemovitel.databinding.ItemHomeBannerBinding
import com.example.clonehomemovitel.databinding.ItemHomeListFavoriteBinding
import com.example.clonehomemovitel.databinding.ItemHomeListProductBinding
import com.example.clonehomemovitel.home.adapter.FavoriteAdapter
import com.example.clonehomemovitel.home.listener.TabHomeAdapterListener

class TabHomeAdapter(private val mContext: Context) : BaseBindingAdapter<TabHomeModel>() {

    var listener: TabHomeAdapterListener? = null

    override fun getLayoutRes(viewType: Int): Int {
        return when (viewType) {
            TabHomeModel.TYPE_HEADER_HOME_NO_LOGIN -> R.layout.item_header_home_no_login
            TabHomeModel.TYPE_HOME_LIST_PRODUCT -> R.layout.item_home_list_product
            TabHomeModel.TYPE_HOME_LIST_FAVORTE -> R.layout.item_home_list_favorite
            else -> R.layout.item_home_empty
        }
    }

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        if (item != null) return item.type
        return TabHomeModel.TYPE_EMPTY
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseBindingViewHolder<ViewDataBinding> {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), getLayoutRes(viewType), parent, false
        )
//        when (binding) {
//            is ItemHeaderHomeNoLoginBinding -> {
//                return BaseBindingViewHolder(binding)
//            }
//            is ItemHomeBannerBinding -> {
//                return BaseBindingViewHolder(binding)
//            }
//            is ItemHomeListFavoriteBinding -> {
//                return BaseBindingViewHolder(binding)
//            }
//            is ItemHomeListProductBinding -> {
//                return BaseBindingViewHolder(binding)
//            }
//        }
        when (binding) {
            is ItemHomeListFavoriteBinding -> {
                binding.apply {
                    val favoriteAdapter = FavoriteAdapter(mConText = mContext)
                    favoriteAdapter.listener = listener
                    rcListFavorite.apply {
                        layoutManager = LinearLayoutManager(mContext)
                        setHasFixedSize(true)
                        adapter = favoriteAdapter
                    }
                }
            }
            is ItemHomeListProductBinding -> {
                binding.apply {
                    indicator.visibility = View.VISIBLE

                }
            }
        }
        return BaseBindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder<ViewDataBinding>, position: Int) {
        TODO("Not yet implemented")
    }
}