package com.saxaindustries.core

import android.util.Log
import java.util.*
import javax.inject.Inject

class CommonStore @Inject constructor() {

    init {
        Log.d("Common STORE", "INIT ${Date().time}")
    }

    fun sayHello() {
        Log.d("COMMON STORE", "Hello! ${this.hashCode()}")
    }
}