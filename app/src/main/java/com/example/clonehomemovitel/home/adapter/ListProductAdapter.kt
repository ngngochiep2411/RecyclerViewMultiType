package com.example.clonehomemovitel.home.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.GridLayoutManager
import com.example.clonehomemovitel.R
import com.example.clonehomemovitel.base.BaseBindingAdapter
import com.example.clonehomemovitel.base.BaseBindingViewHolder
import com.example.clonehomemovitel.databinding.LayoutListProductBinding
import com.example.clonehomemovitel.home.model.FuncHomePage

class ListProductAdapter(val context: Context) : BaseBindingAdapter<FuncHomePage>() {
    override fun getLayoutRes(viewType: Int): Int = R.layout.layout_list_product

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseBindingViewHolder<ViewDataBinding> {
        val binding = DataBindingUtil.inflate<ViewDataBinding>(
            LayoutInflater.from(parent.context), getLayoutRes(viewType), parent, false
        )
        if (binding is LayoutListProductBinding) {
            binding.apply {
                val productAdapter = ProductAdapter(context)
                rcListProduct.apply {
                    layoutManager = GridLayoutManager(context, 4)
                    adapter = productAdapter
                    setHasFixedSize(true)
                }
            }
        }
        return BaseBindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BaseBindingViewHolder<ViewDataBinding>, position: Int) {
        if (holder.binding is LayoutListProductBinding) {
            (holder.binding as LayoutListProductBinding).apply {
                val model = getItem(position)
                
            }
        }

    }
}