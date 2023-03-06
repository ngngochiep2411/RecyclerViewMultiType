package com.example.clonehomemovitel.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.example.clone_supermovitelandroid.model.ProductModel
import com.example.clonehomemovitel.R
import com.example.clonehomemovitel.base.BaseBindingAdapter
import com.example.clonehomemovitel.base.BaseBindingViewHolder
import com.example.clonehomemovitel.databinding.ItemHomeFavoriteBinding
import com.example.clonehomemovitel.home.listener.TabHomeAdapterListener

class FavoriteAdapter(private val mConText: Context) : BaseBindingAdapter<ProductModel>() {

    var listener: TabHomeAdapterListener? = null

    override fun getLayoutRes(viewType: Int): Int {
        return R.layout.item_home_favorite
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseBindingViewHolder<ViewDataBinding> {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), getLayoutRes(viewType), parent, false
        )
        return BaseBindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder<ViewDataBinding>, position: Int) {
        if (holder.binding is ItemHomeFavoriteBinding) {
            (holder.binding as ItemHomeFavoriteBinding).apply {
                when (position % 3) {
                    0 -> {
                        cardView.setBackgroundColor(
                            ContextCompat.getColor(
                                mConText,
                                R.color.color_favorite_1
                            )
                        )
                    }
                    1 -> {
                        cardView.setBackgroundColor(
                            ContextCompat.getColor(
                                mConText,
                                R.color.color_favorite_2
                            )
                        )

                    }
                    2 -> {
                        cardView.setBackgroundColor(
                            ContextCompat.getColor(
                                mConText,
                                R.color.color_favorite_3
                            )
                        )
                    }
                }
                val model = getItem(position)
                tvTitle.text = model!!.serviceName
                tvPrice.text = mConText.getString(R.string.total_price, model.price)
                tvPeriod.text = model.shortDesc
                root.setOnClickListener {
                    listener?.onClickItem(view = it, position = position, model = model)
                }
                btnRegister.setOnClickListener {
                    listener?.onClickBuyProductItem(it, position, model)
                }
            }
        }
    }
}