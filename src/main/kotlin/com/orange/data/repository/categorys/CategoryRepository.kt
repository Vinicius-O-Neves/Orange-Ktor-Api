package com.orange.data.repository.categorys

import com.orange.data.model.CategoryModel

interface CategoryRepository {

    fun getAllCategorys(): List<CategoryModel>

}