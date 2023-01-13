package com.saxaindustries.data__b.dagger

import com.saxaindustries.core.dagger.CoreModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [CoreModule::class])
interface DataBComponent {

}