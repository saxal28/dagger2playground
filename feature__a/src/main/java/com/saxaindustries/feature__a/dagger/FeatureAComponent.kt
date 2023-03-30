package com.saxaindustries.feature__a.dagger

import com.saxaindustries.core.dagger.CoreComponent
import com.saxaindustries.feature__a.FeatureAActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [CoreComponent::class])
interface FeatureAComponent {
    fun inject(featureAActivity: FeatureAActivity)
}