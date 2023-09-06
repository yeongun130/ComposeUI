package com.composebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebasic.ui.theme.ComposeBasicTheme

class ComposeUIFloatingActionButton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Example() {}
                }
            }
        }
    }
}

@Composable
fun Example(onClick: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        FloatingActionButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 70.dp, height = 70.dp),
            backgroundColor = Color.Green,
            contentColor = Color.White
        ) {
            Icon(Icons.Filled.Add, "Filed action button")
        }

        SmallFloatingActionButton(
            onClick = { onClick() },
            modifier = Modifier
                .size(width = 70.dp, height = 70.dp),
            containerColor = Color.Blue
        ) {
            Icon(Icons.Filled.Add, "Small filled action button")
        }

        LargeFloatingActionButton(
            onClick = { onClick() },
            containerColor = Color.Yellow
        ) {
            Icon(Icons.Filled.Send, "Large filled action button")
        }

        ExtendedFloatingActionButton(
            text = { Text("Extended FAB") },
            onClick = { onClick() },
            icon = { Icon(Icons.Filled.Edit, "Extended filled action button")},
            backgroundColor = Color.Red
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview10() {
    ComposeBasicTheme {
        Example() {}
    }
}