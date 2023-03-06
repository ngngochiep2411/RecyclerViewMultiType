package com.example.clone_supermovitelandroid.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class MusicBanner(
    @SerializedName("contentID")
    val contentID: Long,
    @SerializedName("posterVertical")
    val posterVertical: String,
    @SerializedName("posterHorizontal")
    val posterHorizontal: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("totalLike")
    val totalLike: Long,
    @SerializedName("totalListen")
    val totalListen: Long,
    @SerializedName("totalView")
    val totalView: Long,
    @SerializedName("typeName")
    val typeName: String,
    @SerializedName("code")
    val code: String,
    @SerializedName("singer")
    val singers: ArrayList<Singer>
) : Serializable {
    companion object {
        const val VIDEO = "VIDEO"
        const val AUDIO = "AUDIO"
        const val ALBUM = "ALBUM"
    }

    fun convertToSong(): Song {
        return Song(
            code,
            contentID,
            false,
            name,
            posterHorizontal,
            posterVertical,
            singers,
            totalLike,
            totalListen,
            totalView
        )
    }

    fun convertToAlbum(): MusicAlbum {
        return MusicAlbum(contentID, name, posterHorizontal, totalLike, totalView, singers)
    }
}