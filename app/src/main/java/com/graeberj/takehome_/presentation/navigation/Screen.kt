package com.graeberj.takehome_.presentation.navigation

sealed class Screen(val route: String) {
    data object ListScreen : Screen("list_screen")
    data object DetailScreen : Screen("detail_screen/{listId}") {
        fun createRoute(listId: Int) = "detail_screen/$listId"
    }
}