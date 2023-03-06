package com.example.clone_supermovitelandroid.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Song(
    @SerializedName("code")
    var code: String,
    @SerializedName("id")
    val id: Long,
    @SerializedName("isVideo")
    var isVideo: Boolean,
    @SerializedName("name")
    var name: String,
    @SerializedName("posterHorizontal")
    var posterHorizontal: String,
    @SerializedName("posterVertical")
    var posterVertical: String,
    @SerializedName("singer")
    var singers: ArrayList<Singer>? = null,
    @SerializedName("totalLike")
    var totalLike: Long,
    @SerializedName("totalListen")
    var totalListen: Long,
    @SerializedName("totalView")
    var totalView: Long
) : Serializable {
    constructor() : this("", 0, false, "", "", "", null, 0, 0, 0)
}