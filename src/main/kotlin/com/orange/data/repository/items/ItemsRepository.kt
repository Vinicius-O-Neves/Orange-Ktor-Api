package com.orange.data.repository.items

import com.orange.data.model.FoodModel

interface ItemsRepository {

    fun getAllItems(): List<FoodModel>

    fun getItemById(id: Int): FoodModel?

    fun getItemByCategory(category: String): List<FoodModel?>

}