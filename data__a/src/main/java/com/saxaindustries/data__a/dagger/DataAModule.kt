package com.saxaindustries.data__a.dagger

import com.saxaindustries.core.CommonStore
import com.saxaindustries.data__a.DataAStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataAModule {
    @Singleton
    @Provides
    fun providesDataAStore(commonStore: CommonStore) = DataAStore(commonStore)
}