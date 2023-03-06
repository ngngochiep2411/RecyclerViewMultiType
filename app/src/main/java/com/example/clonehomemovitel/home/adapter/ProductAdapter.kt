package com.example.clonehomemovitel.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.bumptech.glide.Glide
import com.example.clonehomemovitel.home.model.FuncHomeModel
import com.example.clonehomemovitel.R
import com.example.clonehomemovitel.base.BaseBindingAdapter
import com.example.clonehomemovitel.base.BaseBindingViewHolder
import com.example.clonehomemovitel.databinding.ItemProductBinding
import com.example.clonehomemovitel.home.listener.TabHomeAdapterListener

class ProductAdapter(val mConText: Context) : BaseBindingAdapter<FuncHomeModel>() {

    var listener: TabHomeAdapterListener? = null

    override fun getLayoutRes(viewType: Int): Int = R.layout.item_product

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseBindingViewHolder<ViewDataBinding> {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context),
            getLayoutRes(viewType),
            parent,
            false
        )
        return BaseBindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder<ViewDataBinding>, position: Int) {
        if (holder.binding is ItemProductBinding) {
            (holder.binding as ItemProductBinding).apply {
                val model = getItem(position)
                tvTitle.text = model!!.funcName
                Glide.with(mConText).load(model.funcIcon).into(ivCover)
                root.setOnClickListener {
                    listener?.onClickItem(view = it, position = position, model = model)
                }
            }
        }
    }
}