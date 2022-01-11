package com.orange.routes

import com.orange.data.repository.items.InMemoryToRepository
import com.orange.data.repository.items.ItemsRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.items() {

    val repository: ItemsRepository = InMemoryToRepository()

    get("/")  {
        call.respond(
            HttpStatusCode.OK,
            repository.getAllItems()
        )
    }
}

