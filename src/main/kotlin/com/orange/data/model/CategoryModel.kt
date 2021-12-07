package com.orange.data.model

import kotlinx.serialization.Serializable

@Serializable
data class CategoryModel (
    val id: Int,
    val categoryName: String,
    val categoryPhoto: String,
)