package com.example.clone_supermovitelandroid.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
class HomeProductModel(
    @SerializedName("groupCode") var groupCode: String? = "",
    @SerializedName("listData") var items: List<ProductModel>? = null,
    @SerializedName("title") var title: String? = "",
) : Parcelable {
    override fun toString(): String {
        return "HomeProductModel(groupCode=$groupCode, listData=$items, title=$title)"
    }
}