package com.example.qr_v1.ui.utils

import android.annotation.SuppressLint
import android.view.View
import java.text.SimpleDateFormat
import java.util.*

fun View.visible(){
    this.visibility = View.VISIBLE
}

fun View.inVisible(){
    this.visibility = View.INVISIBLE
}

fun View.gone(){
    this.visibility = View.GONE
}

@SuppressLint("SimpleDateFormat")
fun Calendar.toFormattedDisplay () : String{
    val simpleDateFormat = SimpleDateFormat("dd/MM/YYYY hh:mm:ss", Locale.GERMANY)
    return simpleDateFormat.format(this.time)
}