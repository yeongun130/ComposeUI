package com.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebasic.ui.theme.ComposeBasicTheme
import kotlin.random.Random

class ComposeUIBox : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BoxContainer()
                }
            }
        }
    }
}

@Composable
fun BoxContainer() {
    Box(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ColorDummyBox(modifier = Modifier.size(200.dp), color = (Color.Yellow))
        ColorDummyBox(modifier = Modifier.size(150.dp), color = (Color.Cyan))
        ColorDummyBox(color = (Color.Magenta))
    }
}

@Composable
fun ColorDummyBox(modifier: Modifier = Modifier, color: Color? = null) {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)

    // color 가 값이 있으면 해당 값을 넣어 주고 값이 없다면 랜덤 값 넣어주기
    val randomColor = color?.let { it } ?: Color(red, green, blue)
    Box(
        modifier = modifier
            .size(100.dp)
            .background(randomColor)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    ComposeBasicTheme {
        BoxContainer()
    }
}