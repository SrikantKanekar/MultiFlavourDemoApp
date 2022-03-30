package com.example.multiflavourdemoapp

import android.content.Context
import android.util.Log
import cn.jpush.android.api.JPushInterface

fun initNotification(context: Context) {
    JPushInterface.setDebugMode(true)
    JPushInterface.init(context)

    val id= JPushInterface.getRegistrationID(context)
    Log.d("registrationId", id)
}