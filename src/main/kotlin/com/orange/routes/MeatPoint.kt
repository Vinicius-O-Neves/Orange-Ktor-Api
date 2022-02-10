package com.orange.routes

import com.orange.data.repository.addIngredient.meatpoint.InMemoryToRepository
import com.orange.data.repository.addIngredient.meatpoint.MeatPointRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.meatPoint() {

    val repository: MeatPointRepository = InMemoryToRepository()

    get("/meatPoint") {
        call.respond(
            HttpStatusCode.OK,
            repository.getAllMeatPoints()
        )
    }

}