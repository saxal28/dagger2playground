package com.saxaindustries.dagger2playground.dagger

import com.saxaindustries.dagger2playground.MainActivity
import com.saxaindustries.data__a.dagger.DataAModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DataAModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)
}