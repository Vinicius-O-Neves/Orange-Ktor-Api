package com.orange.plugins

import com.orange.routes.Categorys
import com.orange.routes.items
import com.orange.routes.itemsByCategory
import com.orange.routes.itemsById
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.content.*
import io.ktor.http.content.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureRouting() {

    routing {
        items()
        itemsById()
        itemsByCategory()
        Categorys()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
