package com.example.clone_supermovitelandroid.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class Singer(
    @SerializedName("id")
    val id: Long,
    @SerializedName("image")
    var image: String,
    @SerializedName("name")
    var name: String
) : Serializable