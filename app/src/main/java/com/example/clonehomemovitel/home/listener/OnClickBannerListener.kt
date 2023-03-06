package com.example.clonehomemovitel.home.listener

import android.view.View
import com.example.clone_supermovitelandroid.model.MusicBanner
import com.example.clonehomemovitel.home.model.BannerModel

interface OnClickBannerListener {
    fun onClickBannerItem(view: View, position: Int, model: BannerModel?) {}
    fun onClickBannerMusic(view: View, position: Int, model: MusicBanner?) {}
}