package com.saxaindustries.data__b.dagger

import com.saxaindustries.core.CommonStore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DataBModule {

    @Singleton
    @Provides
    fun providesDataBStore(commonStore: CommonStore) = DataBStore(commonStore)
}