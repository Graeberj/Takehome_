package com.graeberj.takehome_.domain

import com.graeberj.takehome_.data.Api
import com.graeberj.takehome_.data.model.Item
import com.graeberj.takehome_.data.model.GroupedItem

class ItemRepository {
        private val service = Api.itemService

    suspend fun fetchItems(): List<GroupedItem> {
        val items = service.getItems()
        return filterData(items)
    }
    private fun filterData(items: List<Item>): List<GroupedItem> {
        return items
            .filter { !it.name.isNullOrEmpty() }
            .groupBy { it.listId }
            .toSortedMap()
            .map { entry ->
                GroupedItem(
                    listId = entry.key,
                    items = entry.value.sortedWith(compareBy { getInt(it.name) })
                )
            }
    }

    private fun getInt(name: String?): Int {
        return name?.substringAfter(
            "Item ", "0"
        )?.toIntOrNull() ?: Int.MAX_VALUE
    }
}

