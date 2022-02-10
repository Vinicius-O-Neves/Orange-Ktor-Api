package com.orange.plugins

import com.orange.routes.*
import io.ktor.routing.*
import io.ktor.http.content.*
import io.ktor.application.*

fun Application.configureRouting() {

    routing {
        items()
        itemsById()
        itemsByCategory()
        Categorys()
        addInHamburguer()
        meatPoint()

        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
