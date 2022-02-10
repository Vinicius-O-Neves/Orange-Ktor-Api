package com.orange.data.repository.addIngredient.meatpoint

import com.orange.data.model.MeatPointModel

class InMemoryToRepository: MeatPointRepository {

    private val BASE_URL = "INSERT YOUR API"

    private val meatPoint = listOf(
        MeatPointModel(
            1,
            "Carne Bem Passada",
            "$BASE_URL/foodimages/bem passada.png"
        ),
        MeatPointModel(
            2,
            "Carne ao Ponto",
            "$BASE_URL/foodimages/ao ponto.png"
        ),
        MeatPointModel(
            3,
            "Carne Mal Passada",
            "$BASE_URL/foodimages/mal passada.png"
        )
    )

    override fun getAllMeatPoints(): List<MeatPointModel> {
        return meatPoint
    }

}