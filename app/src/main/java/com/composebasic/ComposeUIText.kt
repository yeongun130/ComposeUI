package com.composebasic

import android.graphics.Paint
import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composebasic.ui.theme.ComposeBasicTheme
import com.teamgrapefruit.composebasic.R

class ComposeUIText : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextContainer()
                    // Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun TextContainer(modifier: Modifier = Modifier) {

    val offset = Offset(5.0f, 10.0f)

    Column(
        modifier
            .fillMaxSize(),
    ) {
        // Text Shadow
        Text(
            text = "Hello World!",
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = offset,
                    blurRadius = 3f
                )
            )
        )

        // Text 굵기
        Text(text = "Hello World!", fontWeight = FontWeight.Bold)

        // Text 기울기
        Text(text = "Android Studio",
            modifier .width(150.dp),
            style = TextStyle(
                fontStyle = FontStyle.Italic,
                fontSize = 20.sp,
                // Text 정렬
                textAlign = TextAlign.Right
            )
        )

        // Font
        Text(text = "Android",
             style = TextStyle(
                 fontFamily = FontFamily.Serif,
                 fontSize = 30.sp
             )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview7() {
    ComposeBasicTheme {
        TextContainer()
        // Greeting3("Android")
    }
}