package com.saxaindustries.dagger2playground.dagger

import com.saxaindustries.dagger2playground.MainActivity
import com.saxaindustries.feature__a.dagger.FeatureAModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FeatureAModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}