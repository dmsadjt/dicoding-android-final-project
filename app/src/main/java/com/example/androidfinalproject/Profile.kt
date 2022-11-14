package com.example.androidfinalproject

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize

data class Profile(
    var name : String = "",
    var email : String = "",
    var photo : Int = 0
) : Parcelable
