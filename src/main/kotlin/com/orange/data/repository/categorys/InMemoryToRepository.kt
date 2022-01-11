package com.orange.data.repository.categorys

import com.orange.data.model.CategoryModel

class InMemoryToRepository: CategoryRepository {

    private val BASE_URL = "http://192.168.15.14:8140"

    val categorys = listOf<CategoryModel>(
        CategoryModel(
            1,
            "Popular",
            "$BASE_URL/foodimages/estrela_dourada-removebg.png"
        ),
        CategoryModel(
            2,
            "Hambúgueres",
            "$BASE_URL/foodimages/basic_burguer_removebg.png"
        ),
        CategoryModel(
            3,
            "Massas",
            "$BASE_URL/foodimages/pasta_removebg-preview.png"
        ),
        CategoryModel(
            4,
            "Drinks",
            "$BASE_URL/foodimages/suco_de_laranja_1-removebg-preview.png"
        ),
        CategoryModel(
            5,
            "Doces",
            "$BASE_URL/foodimages/banana split removed background.jpg"
        )
    )

    override fun getAllCategorys(): List<CategoryModel> {
        return categorys
    }

}