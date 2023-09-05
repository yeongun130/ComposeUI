package com.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composebasic.ui.theme.ComposeBasicTheme
import com.composebasic.ui.theme.Shapes

class ComposeUIBotton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ButtonExample() {}
                }
            }
        }
    }
}

@Composable
fun ButtonExample(onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
                .background(color = Color.White, shape = RoundedCornerShape(50.dp)),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Gray,
                contentColor = Color.Blue
            )
        ) {
            Text("Filled")
        }

        FilledTonalButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp)
        ) {
            Text(text = "Tonal")
        }

        OutlinedButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp),
            border = BorderStroke(3.dp, Color.Black),
            colors = ButtonDefaults.outlinedButtonColors(
                backgroundColor = Color.Yellow,
                contentColor = Color.Red
            )
        ) {
            Text(text = "OutlineButton")
        }

        ElevatedButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 240.dp, height = 100.dp),
            elevation = androidx.compose.material3.ButtonDefaults.elevatedButtonElevation(
                defaultElevation = 24.dp
            )
        ) {
            Text(text = "ElevateButton")
        }

        TextButton(onClick = { onClick() }) {
            Text(text = "TextButton")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview9() {
    ComposeBasicTheme {
        ButtonExample() {}
    }
}