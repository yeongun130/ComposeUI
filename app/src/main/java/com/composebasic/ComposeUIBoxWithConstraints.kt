package com.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
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

class ComposeUIBoxWithConstraints : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Greeting3("Android")
                    BoxWithConstraintsContainer()
                }
            }
        }
    }
}

@Composable
fun BoxWithConstraintsContainer() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        // 높이에 따른 색깔
        if(this.minHeight > 400.dp) {
            ColorDummyBox(modifier = Modifier.size(200.dp), color = Color.Yellow)
        } else {
            ColorDummyBox(modifier = Modifier.size(200.dp), color = Color.Green)
        }
        Text(text = "minHeight: ${this.minHeight}")

        // 넓이에 따른 색깔
        Column() {
            BoxWithConstraintsItem(
                modifier = Modifier
                    .size(200.dp)
                    .background(Color.Yellow)
            )
            BoxWithConstraintsItem(
                modifier = Modifier
                    .size(300.dp)
                    .background(Color.Green)
            )
        }
//        ColorDummyBox(modifier = Modifier.size(200.dp), color = Color.Yellow)
//        ColorDummyBox(modifier = Modifier.size(150.dp), color = Color.Green)
//        ColorDummyBox(color = Color.Blue)
    }
}

@Composable
fun BoxWithConstraintsItem(modifier: Modifier = Modifier) {
    BoxWithConstraints(
        modifier = modifier,
        contentAlignment = Alignment.Center,
        propagateMinConstraints = false
    ) {
        if(this.minWidth > 200.dp) {
            Text(text = "이것은 큰 상자입니다.")
        } else {
            Text(text = "이것은 작은 상자입니다.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview6() {
    ComposeBasicTheme {
        BoxWithConstraintsContainer()
    }
}