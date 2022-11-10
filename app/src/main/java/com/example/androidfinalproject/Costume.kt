package com.example.androidfinalproject

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Costume(
 var name: String = "",
 var price: Int = 0,
 var detail: String = "",
 var size: String = "",
 var photo: Int = 0,
 var pieces: Int = 0,
 var source: Int = 0,
) : Parcelable
