package com.saxaindustries.feature__a.dagger

import com.saxaindustries.core.dagger.CoreComponent

object FeatureAWrapper {
    lateinit var component: FeatureAComponent

    fun init(coreComponent: CoreComponent) {
        component = DaggerFeatureAComponent
            .builder()
            .coreComponent(coreComponent)
            .build()
    }
}