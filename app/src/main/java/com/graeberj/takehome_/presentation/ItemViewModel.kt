package com.graeberj.takehome_.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.graeberj.takehome_.data.model.GroupedItem
import com.graeberj.takehome_.domain.ItemRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class ItemViewModel(private val repository: ItemRepository) : ViewModel() {

    private val _groupedItems = MutableStateFlow<List<GroupedItem>>(emptyList())
    val groupedItems: StateFlow<List<GroupedItem>> = _groupedItems

    init {
        fetchItems()
    }

    private fun fetchItems() {
        viewModelScope.launch {
            val items = repository.fetchItems()
            _groupedItems.value = items
        }
    }
}