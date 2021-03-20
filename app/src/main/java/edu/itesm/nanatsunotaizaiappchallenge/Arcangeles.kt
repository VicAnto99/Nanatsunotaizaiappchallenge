package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Arcangeles(val photo:Int, val name:String, val gracia:String, val info:String) : Parcelable

