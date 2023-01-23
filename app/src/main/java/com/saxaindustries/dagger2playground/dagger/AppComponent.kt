package com.saxaindustries.dagger2playground.dagger

import com.saxaindustries.dagger2playground.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}