package com.composebasic.uitls

data class RandomUser(
    val name: String = "Android Developer 👏",
    val description: String = "배우려고 노력하는 개발자입니다.",
    val profileImg: String = "https://randomuser.me/api/portraits/men/55.jpg"
)

object DummyDataProvider {
    val userList = List<RandomUser>(200) { RandomUser() }
}