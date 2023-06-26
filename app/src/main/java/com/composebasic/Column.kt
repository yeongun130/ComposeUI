package com.composebasic

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composebasic.ui.theme.ComposeBasicTheme
import com.composebasic.uitls.DummyDataProvider
import com.composebasic.uitls.RandomUser

class Column : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                Greeting2(name = "Android")
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Greeting2(name: String) {
    // A surface container using the 'background' color from the theme
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Scaffold(topBar = { MyAppBar() })
        {
            RandomUserListView(randomUsers = DummyDataProvider.userList)
        }
    }
}

@Composable
fun MyAppBar() {
    TopAppBar(
        elevation = 8.dp,
        modifier = Modifier.height(58.dp)
    ) {
        Text(
            text = "LazyColumn",
            modifier = Modifier
                .padding(8.dp)
                .align(Alignment.CenterVertically),
            fontSize = 18.sp,
            fontWeight = FontWeight.Black
        )
    }
}

@Composable
fun RandomUserListView(randomUsers: List<RandomUser>) {
    // 메모리 관리가 들어간 LazyColumn
    LazyColumn() {
        items(randomUsers) { aRandomUser ->
            Text(text = aRandomUser.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    ComposeBasicTheme {
        Greeting2("Android")
    }
}