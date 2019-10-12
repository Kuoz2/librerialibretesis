package com.example.pruebadegradleparatesis

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@SpringBootApplication
class PruebadegradleparatesisApplication

fun main(args: Array<String>) {
    runApplication<PruebadegradleparatesisApplication>(*args)
}
