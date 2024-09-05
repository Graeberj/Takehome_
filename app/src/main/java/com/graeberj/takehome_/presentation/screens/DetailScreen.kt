package com.graeberj.takehome_.presentation.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import com.graeberj.takehome_.data.model.Item
import com.graeberj.takehome_.presentation.ItemViewModel
import com.graeberj.takehome_.presentation.components.ItemDetail
import org.koin.androidx.compose.koinViewModel

@Composable
fun DetailScreen(
    listId: Int,
    viewModel: ItemViewModel = koinViewModel()
) {
    val groupedItems by viewModel.groupedItems.collectAsState()
    val groupedItem = groupedItems.find { it.listId == listId }

    LazyColumn {
        groupedItem?.items?.let { items ->
            items(items) { item: Item ->
                ItemDetail(item)
            }
        }
    }
}