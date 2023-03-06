package com.example.clone_supermovitelandroid.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MusicAlbum(
    @SerializedName("id")
    val id: Long,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("totalLike")
    val totalLike: Long,
    @SerializedName("totalView")
    val totalView: Long,
    @SerializedName("singer")
    val singers: ArrayList<Singer>
) : Serializable