package com.saxaindustries.dagger2playground

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.saxaindustries.core.CommonStore
import com.saxaindustries.dagger2playground.ui.theme.Dagger2PlaygroundTheme
import com.saxaindustries.feature__a.FeatureAActivity
import javax.inject.Inject

class MainActivity : ComponentActivity() {

    @Inject
    lateinit var commonStore: CommonStore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (applicationContext as MainApplication).appComponent.inject(this)

        setContent {
            Dagger2PlaygroundTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    Button(onClick = {
                        startActivity(
                            Intent(
                                applicationContext,
                                FeatureAActivity::class.java
                            )
                        )
                    }) {
                        Text(text = "To Feature A")
                    }
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        commonStore.sayHello()
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Dagger2PlaygroundTheme {
        Greeting("Android")
    }
}