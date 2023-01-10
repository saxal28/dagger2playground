package com.saxaindustries.dagger2playground

import android.app.Application
import com.saxaindustries.dagger2playground.dagger.DaggerApplicationComponent

class MainApplication: Application() {
    // Reference to the application graph that is used across the whole app
    val appComponent = DaggerApplicationComponent.create()
}