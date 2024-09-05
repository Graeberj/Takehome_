package com.graeberj.takehome_.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.graeberj.takehome_.data.model.Item

@Composable
fun ItemDetail(item: Item) {
    Box( modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(
            width = .5.dp,
            color = Color.DarkGray,
            shape = RoundedCornerShape(8.dp)
        )
            .background(
                color = Color.Gray,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Text(
            text = "ID: ${item.id}, Name: ${item.name ?: ""}",
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}