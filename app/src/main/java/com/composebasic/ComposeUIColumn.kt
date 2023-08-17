package com.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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

class ComposeUIColumn : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    VerticalContainer()
                }
            }
        }
    }
}

@Composable
fun VerticalContainer() {
    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        RandDummyBox()
        RandDummyBox()
        RandDummyBox()
    }
}

@Composable
fun RandDummyBox(modifier: Modifier = Modifier) {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)
    val randomColor = Color(red, green, blue)

    Box(
        modifier = modifier
            .size(100.dp)
            .background(randomColor)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    ComposeBasicTheme {
        VerticalContainer()
    }
}