package com.orange.data.model

import kotlinx.serialization.Serializable

@Serializable
data class MeatPointModel (
    val id: Int,
    val meatPointName: String,
    val meatPointImage: String,
)
