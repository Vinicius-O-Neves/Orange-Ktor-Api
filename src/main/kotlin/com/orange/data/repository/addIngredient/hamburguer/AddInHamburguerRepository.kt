package com.orange.data.repository.addIngredient.hamburguer

import com.orange.data.model.AddInHamburguerModel

interface AddInHamburguerRepository {

    fun getAllItemsToAdd(): List<AddInHamburguerModel>

}