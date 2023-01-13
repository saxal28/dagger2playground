package com.saxaindustries.data__b.dagger

import android.util.Log
import com.saxaindustries.core.CommonStore
import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataBStore @Inject constructor(private val commonStore: CommonStore) {

    init {
        Log.d("DataB STORE", "Hello! ${Date().time}")
    }

    fun sayHello() {
        commonStore.sayHello()
    }
}