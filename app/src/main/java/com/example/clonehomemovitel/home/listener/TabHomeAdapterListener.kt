package com.example.clonehomemovitel.home.listener

import android.os.Parcelable

interface TabHomeAdapterListener : OnClickBannerListener, CategoryAdapterListener {
    fun onClickMenu()
    fun onClickSearch()
    fun onClickLanguage()
    fun onClickSignUp()
    fun onClickLogin()
    fun onClickProfile()
    fun onClickSeeAll(title: String?, type: Int, model: Parcelable? = null)
}