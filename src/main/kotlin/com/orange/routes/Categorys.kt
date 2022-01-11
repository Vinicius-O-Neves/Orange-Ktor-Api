package com.orange.routes

import com.orange.data.repository.categorys.CategoryRepository
import com.orange.data.repository.categorys.InMemoryToRepository
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun Route.Categorys() {

    val repository: CategoryRepository = InMemoryToRepository()

    get("/categorys") {
        call.respond(
            HttpStatusCode.OK,
            repository.getAllCategorys()
        )
    }
}