package com.orange.data.model

import kotlinx.serialization.Serializable

@Serializable
data class AddInHamburguerModel (
    val id: Int,
    val itemName: String,
    val itemImage: String,
)