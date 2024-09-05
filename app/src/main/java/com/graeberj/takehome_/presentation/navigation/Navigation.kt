package com.graeberj.takehome_.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.graeberj.takehome_.presentation.screens.DetailScreen
import com.graeberj.takehome_.presentation.screens.ListScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.ListScreen.route) {
        composable(route = Screen.ListScreen.route) {
            ListScreen(navController = navController)
        }
        composable(
            route = Screen.DetailScreen.route,
            arguments = listOf(navArgument("listId") { type = NavType.IntType })
        ) { backStackEntry ->
            val listId = backStackEntry.arguments?.getInt("listId")
            DetailScreen(listId = listId ?: 0)
        }
    }
}