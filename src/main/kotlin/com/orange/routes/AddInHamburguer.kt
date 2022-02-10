package com.orange.routes

import com.orange.data.repository.addIngredient.hamburguer.AddInHamburguerRepository
import com.orange.data.repository.addIngredient.hamburguer.InMemoryToRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.addInHamburguer() {

    val repository: AddInHamburguerRepository = InMemoryToRepository()

    get("/addInHamburguer") {
        call.respond(
           HttpStatusCode.OK,
           repository.getAllItemsToAdd()
        )
    }

}