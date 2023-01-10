package com.saxaindustries.core.dagger

import com.saxaindustries.core.CommonStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {
    @Singleton
    @Provides
    fun providesCommonStore(): CommonStore {
        return CommonStore()
    }
}