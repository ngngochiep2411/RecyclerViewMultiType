/*
 * Copyright (c) https://bigzun.blogspot.com/
 * Email: bigzun.com@gmail.com
 * Created by admin on 2020/11/28
 *
 */

package com.example.clone_supermovitelandroid.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
open class PackageHomeModel : Parcelable {
    var title: String? = null
    var amount: String? = null
    var unit: String? = null
    var imageUrl: String? = null
    var description: String? = null
    var isRegister:Int = 0
}