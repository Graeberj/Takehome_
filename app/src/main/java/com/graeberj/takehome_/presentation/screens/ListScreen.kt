package com.graeberj.takehome_.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import com.graeberj.takehome_.data.model.GroupedItem
import com.graeberj.takehome_.presentation.ItemViewModel
import com.graeberj.takehome_.presentation.components.ListItem
import com.graeberj.takehome_.presentation.navigation.Screen
import org.koin.androidx.compose.koinViewModel

@Composable
fun ListScreen(
    navController: NavController,
    viewModel: ItemViewModel = koinViewModel()
) {
    val groupedItems by viewModel.groupedItems.collectAsState()

    LazyColumn {
        groupedItems.forEach { groupedItem: GroupedItem ->
            item {
                ListItem(
                    listId = groupedItem.listId,
                    onClick = { navController.navigate(Screen.DetailScreen.createRoute(groupedItem.listId)) }
                )
            }
        }
    }
}

