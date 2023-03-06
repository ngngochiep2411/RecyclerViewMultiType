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
open class FuncHomeModel(
    @SerializedName("deepLink") var deepLink: String? = "",
    @SerializedName("funcBadge") var funcBadge: String? = "",
    @SerializedName("funcIcon") var funcIcon: String? = "",
    @SerializedName("funcName") var funcName: String? = "",
    @SerializedName("funcType") var funcType: String? = "",
) : Parcelable {
    var resIcon: Int = 0
    override fun toString(): String {
        return "FuncHomeModel(deepLink=$deepLink, funcBadge=$funcBadge, funcIcon=$funcIcon, funcName=$funcName, funcType=$funcType, resIcon=$resIcon)"
    }
}
