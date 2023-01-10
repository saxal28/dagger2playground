package com.saxaindustries.core

import android.util.Log
import javax.inject.Inject

class CommonStore @Inject constructor() {
    fun sayHello() {
        Log.d("COMMON STORE", "Hello! ${this.hashCode()}")
    }
}