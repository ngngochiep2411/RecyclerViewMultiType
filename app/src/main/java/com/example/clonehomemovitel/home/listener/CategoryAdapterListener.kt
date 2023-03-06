package com.example.clonehomemovitel.home.listener

import android.view.View
import androidx.databinding.ViewDataBinding
import com.example.clone_supermovitelandroid.model.ProductModel

interface CategoryAdapterListener {
    fun onClickItem(view: View, position: Int, model: Any?)
    fun onClickItem(binding: ViewDataBinding, view: View, position: Int, model: Any?) {}
    fun onClickBuyProductItem(view: View, position: Int, model: ProductModel?) {}
}