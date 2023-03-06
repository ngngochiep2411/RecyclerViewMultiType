/*
 * Copyright (c) https://bigzun.blogspot.com/
 * Email: bigzun.com@gmail.com
 * Created by admin on 2020/12/5
 *
 */

package com.example.clone_supermovitelandroid.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
open class ProductModel(
	@SerializedName("description") var description: String? = "",
	@SerializedName("iconLink") var iconLink: String? = "",
	@SerializedName("imageLink") var imageLink: String? = "",
	@SerializedName("price") var price: Int? = 0,
	@SerializedName("serviceDesc") var serviceDesc: String? = "",
	@SerializedName("serviceName") var serviceName: String? = "",
	@SerializedName("shortDesc") var shortDesc: String? = "",
	@SerializedName("serviceCode") var serviceCode: String? = "",
	@SerializedName("isVasCp") var isVasCp: Int? = 0,
) : Parcelable {
	override fun toString(): String {
		return "ProductModel(description=$description, iconLink=$iconLink, imageLink=$imageLink, price=$price, serviceDesc=$serviceDesc, serviceName=$serviceName, shortDesc=$shortDesc, serviceCode=$serviceCode, isVasCp=$isVasCp)"
	}
}