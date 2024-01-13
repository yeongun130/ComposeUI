package com.composebasic

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Pager() {
    HorizontalPager(
        state = pagerState
    ) { page ->
        when (page % 3) {
              0 -> {
                  Image(
                      painter = painterResource(R.drawable.first_banner),
                      contentDescription = "First Banner",
                      modifier = modifier.fillMaxWidth(),
                      contentScale = ContentScale.FillBounds
                  )
            }

            1 -> {
                Image(
                    painter = painterResource(R.drawable.second_banner),
                    contentDescription = "Second Banner",
                    modifier = modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }

            2 -> {
                Image(
                    painter = painterResource(R.drawable.third_banner),
                    contentDescription = "Third Banner",
                    modifier = modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }
    Column(
        modifier = modifier.padding(bottom = 12.dp)
    ) {
        PagerIndicator(
                count = 3,
                currentPage = pagerState.currentPage % 3,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PagerPreview() {
      Pager()
}
