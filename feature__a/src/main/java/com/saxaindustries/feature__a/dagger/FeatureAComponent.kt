package com.saxaindustries.feature__a.dagger

import com.saxaindustries.data__a.dagger.DataAModule
import com.saxaindustries.data__b.dagger.DataBModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [DataAModule::class, DataBModule::class])
interface FeatureAComponent {

}