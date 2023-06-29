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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composebasic.ui.theme.ComposeBasicTheme
import java.util.*
import kotlin.random.Random

class ComposeUIRow : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Container()
//                    Greeting3("Android")
                }
            }
        }
    }
}

// arrangement 요소를 어떤식으로 배열할지
/* arrangement는 Row, Column 같은 요소들이 들어가는
   Container 성격의 @Composable에서 요소들의 아이템을 정렬 할 때 사용된다. */

// horizontal Arrangement 이니까 Start, End, Center 만 존재
// Arrangement.SpaceBetween : 공간 모두 차지, 사이에 공간을 밀어넣기
// Arrangement.Start : 왼쪽
// Arrangement.End : 오른쪽
// Arrangement.SpaceAround : 빈 공간을 남겨두기
// Arrangement.Center : 요소들에 넣기
// Arrangement.SpaceEvenly : 요소들 사이에 공간을 똑같이 하기

// alignment
// Alignment.Bottom : 컨테이너의 아래에 두기
// Alignment.Top : 컨테이너의 위에 두기
// 현재는 Row Composable 안에서 align이 들어가기 때문에 Center Vertically
// Alignment.CenterVertically : 컨테이너의 수직방향으로 중앙에 두기

@Composable
fun Container() {
    Row(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize(),
        horizontalArrangement = Arrangement.Center
    ) {
        DummyBox()
        DummyBox()
        DummyBox()
    }
}

@Composable
fun DummyBox(modifier: Modifier = Modifier) {
    val red = Random.nextInt(256)
    val green = Random.nextInt(256)
    val blue = Random.nextInt(256)
    val randomColor = Color(red, green, blue)
        
    Box(modifier = modifier
        .size(100.dp)
        .background(randomColor))
}

//@Composable
//fun Greeting3(name: String) {
//    Text(text = "Hello $name!")
//}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ComposeBasicTheme {
        Container()
//        Greeting3("Android")
    }
}