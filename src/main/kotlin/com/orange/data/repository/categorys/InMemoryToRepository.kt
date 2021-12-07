package com.orange.data.repository.categorys

import com.orange.data.model.CategoryModel

class InMemoryToRepository: CategoryRepository {

    private val BASE_URL = "192.168.0.101:8140"

    val categorys = listOf<CategoryModel>(
        CategoryModel(
            1,
            "popular",
            "$BASE_URL/foodimages/big-cheeseburger-and-french-fries.jpg"
        ),
        CategoryModel(
            2,
            "Burguer",
            "$BASE_URL/foodimages/super_bacon_burguer-removebg.png"
        ),
        CategoryModel(
            3,
            "Pasta",
            "$BASE_URL/foodimages/pasta_removebg-preview.png"
        ),
        CategoryModel(
            4,
            "Drink",
            "$BASE_URL/foodimages/orange-juice-realistic-design-by-Vexels.svg"
        ),
        CategoryModel(
            5,
            "Dessert",
            "$BASE_URL/foodimages/churros-removebg.png"
        )
    )

    override fun getAllCategorys(): List<CategoryModel> {
        return categorys
    }

}