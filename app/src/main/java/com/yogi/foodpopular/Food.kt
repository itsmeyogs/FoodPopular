package com.yogi.foodpopular

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Food(
    val name:String,
    val description:String,
    val history:String,
    val photo:String

): Parcelable
