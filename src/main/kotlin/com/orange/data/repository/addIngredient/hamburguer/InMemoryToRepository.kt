package com.orange.data.repository.addIngredient.hamburguer

import com.orange.data.model.AddInHamburguerModel

class InMemoryToRepository: AddInHamburguerRepository {

    private val BASE_URL = "http://192.168.15.14:8140"

    val itemsToAdd = listOf<AddInHamburguerModel>(
        AddInHamburguerModel(
            1,
            "Fatia de Bacon",
            "$BASE_URL/foodimages/bacon.png"
        ),
        AddInHamburguerModel(
            2,
            "Carne 100% Bovina",
            "$BASE_URL/foodimages/hamburguer-600x400-caf9b230.jpg"
        ),
        AddInHamburguerModel(
            3,
            "Fatia de Queijo Chedder",
            "$BASE_URL/foodimages/queijo-cheddar-polenghi-144g.jpg"
        ),
        AddInHamburguerModel(
            4,
            "Fatia de Picles",
            "$BASE_URL/foodimages/808949-picles-de-pilha-de-fatias-foto.jpg"
        ),
        AddInHamburguerModel(
            5,
            "Fatia de Tomate",
            "$BASE_URL/foodimages/tomate.jpg"
        )
    )



    override fun getAllItemsToAdd(): List<AddInHamburguerModel> {
        return itemsToAdd
    }

}