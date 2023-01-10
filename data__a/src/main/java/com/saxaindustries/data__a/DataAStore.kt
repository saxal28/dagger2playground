package com.saxaindustries.data__a

import com.saxaindustries.core.CommonStore
import javax.inject.Inject

class DataAStore @Inject constructor(private val commonStore: CommonStore) {
    fun callCommonStore() {
        commonStore.sayHello()
    }
}