package com.gk.apps.ktor.sample

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    routing {
        get("/items") {
            call.respondText("{\"items\":[" +
                    "{\"id\":\"id1\"}," +
                    "{\"id\":\"id2\"}," +
                    "{\"id\":\"id3\"}," +
                    "{\"id\":\"id4\"}," +
                    "{\"id\":\"id5\"}," +
                    "{\"id\":\"id6\"}" +
                    "]}")
        }
        get("/detail") {
            val idParam = call.parameters["id"]
            call.respondText("{\"details\":" +
                    "\"Here are the details of item with id=$idParam\"}")
        }
    }
}

