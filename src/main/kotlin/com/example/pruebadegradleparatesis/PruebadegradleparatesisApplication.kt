package com.example.pruebadegradleparatesis

import com.fasterxml.jackson.databind.DeserializationConfig
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration


@Configuration
@SpringBootApplication
class PruebadegradleparatesisApplication

fun main(args: Array<String>) {

    runApplication<PruebadegradleparatesisApplication>(*args)
}
