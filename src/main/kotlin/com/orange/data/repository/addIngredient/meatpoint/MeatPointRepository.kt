package com.orange.data.repository.addIngredient.meatpoint

import com.orange.data.model.MeatPointModel

interface MeatPointRepository {

    fun getAllMeatPoints(): List<MeatPointModel>

}