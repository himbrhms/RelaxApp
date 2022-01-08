package com.himbrhms.relaxapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.himbrhms.relaxapp.ui.HomeScreen
import com.himbrhms.relaxapp.ui.theme.RelaxAppTheme
import com.himbrhms.relaxapp.util.Logger
import com.himbrhms.relaxapp.util.className

class MainActivity : ComponentActivity() {

    companion object {
        private val logger = Logger(this::class.className)
    }

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.info("onCreate")
        setContent {
            RelaxAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    HomeScreen()
                }
            }
        }
    }
}

@ExperimentalFoundationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RelaxAppTheme {
        HomeScreen()
    }
}