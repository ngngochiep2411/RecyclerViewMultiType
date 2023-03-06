package com.example.clonehomemovitel.home

import android.os.Parcelable
import com.example.clonehomemovitel.home.model.FuncHomeModel
import com.example.clone_supermovitelandroid.model.MovieModel
import com.example.clone_supermovitelandroid.model.ProductModel
import com.example.clonehomemovitel.home.model.BannerModel
import kotlinx.android.parcel.Parcelize

@Parcelize
class TabHomeModel(
    var type: Int = 0,
    var title: String? = "",
    var groupCode: String = ""
) : Parcelable {
    val listFunc: ArrayList<FuncHomeModel> by lazy { ArrayList<FuncHomeModel>() }
    val listBanner: ArrayList<BannerModel> by lazy { ArrayList<BannerModel>() }
    var productModel: ProductModel? = null
    val listHotTrending: ArrayList<MovieModel> by lazy { ArrayList<MovieModel>() }
    var isViewAll = false

    constructor(type: Int) : this() {
        this.type = type
    }

    constructor(type: Int, title: String?) : this() {
        this.type = type
        this.title = title
    }

    companion object {
        const val TYPE_EMPTY = 0
        const val TYPE_HEADER_HOME_NO_LOGIN = 1
        const val TYPE_HOME_LIST_PRODUCT = 2
        const val TYPE_HOME_LIST_FAVORTE = 3
    }
}
