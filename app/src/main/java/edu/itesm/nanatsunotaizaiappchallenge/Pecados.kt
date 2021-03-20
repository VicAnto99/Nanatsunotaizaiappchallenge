package edu.itesm.nanatsunotaizaiappchallenge

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pecados(val photo:Int, val name:String, val pecado:String, val simbolo:String,  val info:String) : Parcelable
