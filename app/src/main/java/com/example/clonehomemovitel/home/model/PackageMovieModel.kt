/*
 * Copyright (c) https://bigzun.blogspot.com/
 * Email: bigzun.com@gmail.com
 * Created by admin on 2021/3/26
 *
 */

package com.example.clone_supermovitelandroid.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PackageMovieModel(
	@SerializedName("package_code") var packageCode: String? = "",
	@SerializedName("package_name") var packageName: String? = "",
) : Parcelable