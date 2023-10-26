package com.composebasic

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

@Composable
fun ComposeDialog() {
    Dialog(onDismissRequest = {}) {
        Surface(
            modifier = Modifier
                .width(200.dp)
                .wrapContentHeight(),
            shape = RoundedCornerShape(12.dp),
            color = Color.White
        ) {
            DialogContent()
        }
    }
}

@Composable
fun DialogContent() {
    Column {
        Spacer(
            modifier = Modifier
                .height(12.dp)
                .fillMaxWidth()
        )

        Text(
            text = "Compose With Kotlin!",
            fontSize = 16.sp,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .fillMaxWidth()
                .wrapContentSize(),
            textAlign = TextAlign.Center,
            lineHeight = 17.sp
        )

        Spacer(
            modifier = Modifier
                .height(12.dp)
                .fillMaxWidth()
        )

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            Text(
                text = "Enter",
                fontSize = 12.sp
            )
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(12.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeDialogPreview() {
    ComposeDialog()
}