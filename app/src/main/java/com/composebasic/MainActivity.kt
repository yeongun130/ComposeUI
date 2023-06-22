package com.composebasic

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebasic.ui.theme.ComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Greeting(name: String) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "ComposeApp") },
            backgroundColor = Color(0xfff25287)
        )
    },
        floatingActionButtonPosition = FabPosition.End,
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text(text = "클릭")
            }
        }
    ) {
        MyComposableView()
    }
}

@Composable
fun MyRowItem() {
    Log.d("TAG", "MyRowItem: ")
    val modifier = Modifier.padding(all = 10.dp)

    // LinearLayout Horizontal
    Row(
        Modifier
            .padding(10.dp)
            .background(Color(0xfff25287))
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "Android!", modifier.background(Color.Yellow))
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Android!", modifier.background(Color.Green))
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = "Android!", modifier.background(Color.Blue))
    }
}

@Composable
fun MyComposableView() {
    Log.d("TAG", "MyComposableView: ")
    val modifier = Modifier.padding(all = 10.dp)

    // LinearLayout Vertical
    Column(
        Modifier
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
    ) {
        for (component in 0..30) {
            MyRowItem()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasicTheme {
        Greeting("Android")
    }
}