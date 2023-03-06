package com.example.clone_supermovitelandroid.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
open class MovieModel(
    @SerializedName("actors")
    var actors: List<Actor>? = null,
    @SerializedName("age")
    var age: Int? = 0,
    @SerializedName("brief")
    var brief: String? = "",
    @SerializedName("category")
    var category: List<Category>? = null,
    @SerializedName("cover")
    var cover: String? = "",
    @SerializedName("default_clip_id")
    var defaultClipId: Int? = 0,
    @SerializedName("description")
    var description: String? = "",
    @SerializedName("directors")
    var directors: List<Director>? = null,
    @SerializedName("duration")
    var duration: String? = "",
    @SerializedName("id")
    var id: Int? = 0,
    @SerializedName("is_series")
    var isSeries: Int? = 0,
    @SerializedName("manufacturers")
    var manufacturers: List<Manufacturer>? = null,
    @SerializedName("media_url")
    var mediaUrl: String? = "",
    @SerializedName("nation")
    var nation: String? = "",
    @SerializedName("published_year")
    var publishedYear: Int? = 0,
    @SerializedName("thumb")
    var thumb: String? = "",
    @SerializedName("title")
    var title: String? = "",
    @SerializedName("title_original")
    var titleOriginal: String? = "",
    //todo thông tin lỗi để show dialog mời đăng ký
    var msgMovieError: String? = "",
    var listPackages: ArrayList<PackageMovieModel>? = null,
) : Parcelable {
    @Parcelize
    open class Actor(
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("title")
        var title: String? = ""
    ) : Parcelable

    @Parcelize
    open class Category(
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("title")
        var title: String? = ""
    ) : Parcelable

    @Parcelize
    open class Director(
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("title")
        var title: String? = ""
    ) : Parcelable

    @Parcelize
    open class Manufacturer(
        @SerializedName("id")
        var id: String? = "",
        @SerializedName("title")
        var title: String? = ""
    ) : Parcelable
}