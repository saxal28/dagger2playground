package com.saxaindustries.dagger2playground.dagger

import com.example.feature__order.di.FeatureOrderModule
import com.saxaindustries.dagger2playground.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [FeatureOrderModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}