package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mandamientos(val photo:Int, val name:String, val mandamiento:String, val info:String) : Parcelable
