/*
 * Copyright (c) https://bigzun.blogspot.com/
 * Email: bigzun.com@gmail.com
 * Created by admin on 2020/11/28
 *
 */

package com.example.clonehomemovitel.home.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
open class BannerModel(
    @SerializedName("deepLink")
    var deepLink: String? = null,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("imageUrl")
    var imageUrl: String? = null,
    @SerializedName("shortDescription")
    var shortDescription: String? = null
) : Parcelable {

    override fun toString(): String {
        return super.toString()
    }
}