package com.orange.routes

import com.orange.data.repository.items.InMemoryToRepository
import com.orange.data.repository.items.ItemsRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.itemsById() {

    val repository: ItemsRepository = InMemoryToRepository()

    get("/items/{id}") {
        val id = call.parameters["id"]!!.toIntOrNull()
        val item = repository.getItemById(id!!)

        if (id == null) {
            call.respond(
                HttpStatusCode.BadRequest,
                "O parâmetro de id precisa ser um número"
            )
            return@get
        }

        if (item == null) {
            call.respond(
                HttpStatusCode.BadRequest,
                "Item não encontrado"
            )
        } else {
            call.respond(
                HttpStatusCode.OK,
                item
            )
        }
    }

}