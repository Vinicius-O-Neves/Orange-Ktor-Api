package com.orange.routes

import com.orange.data.repository.items.InMemoryToRepository
import com.orange.data.repository.items.ItemsRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.itemsByCategory() {

    val repository: ItemsRepository = InMemoryToRepository()

    get("/items/category/{category}") {
        val category = call.parameters["category"]!!
        val item = repository.getItemByCategory(category)

        if (category == null) {
            call.respond(
                HttpStatusCode.BadRequest,
                "O parâmetro de category precisa ser um número"
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