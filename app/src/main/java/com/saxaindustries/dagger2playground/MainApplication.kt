package com.saxaindustries.dagger2playground

import android.app.Application
import com.saxaindustries.dagger2playground.dagger.DaggerApplicationComponent
import com.saxaindustries.feature__a.dagger.FeatureAWrapper

class MainApplication: Application() {
    // Reference to the application graph that is used across the whole app
    val commonComponent = DaggerApplicationComponent.builder().build()

    val featureAComponent = FeatureAWrapper.init(commonComponent)
    val appComponent = DaggerApplicationComponent.create()

}