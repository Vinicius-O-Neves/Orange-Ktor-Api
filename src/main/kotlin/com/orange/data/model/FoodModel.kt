package com.orange.data.model

import kotlinx.serialization.Serializable

@Serializable
data class FoodModel(
    val id: Int,
    val name: String,
    val category: String,
    val price: String,
    val description: String,
    val frontCoverUrl: String,
    val imageDescription1: String,
    val imageDescription2: String,
    val serve: String,
)