package com.saxaindustries.feature__a
import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.saxaindustries.core.CommonStore
import com.saxaindustries.feature__a.dagger.FeatureAWrapper
import javax.inject.Inject

class FeatureAActivity: ComponentActivity() {

    @Inject
    lateinit var commonStore: CommonStore

    init {
        FeatureAWrapper.component.inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setContent {
            Text("hi")
        }
    }

    override fun onResume() {
        super.onResume()
        commonStore.sayHello()
    }
}