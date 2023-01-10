package com.saxaindustries.dagger2playground

import androidx.lifecycle.ViewModel
import com.saxaindustries.data__a.DataAStore
import javax.inject.Inject

class MainViewModel @Inject constructor(dataAStore: DataAStore): ViewModel() {

    init {
//        ApplicationComponent.inject(this)
        dataAStore.callCommonStore()
    }
}