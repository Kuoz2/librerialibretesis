package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Ventas
import com.example.pruebadegradleparatesis.Repository.VentasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/ventas")
class ControllerVentas {
    @Autowired
    lateinit var ventas:VentasRepository


    @GetMapping
    fun todaslaventas(): MutableList<Ventas> {
        return ventas.findAll()
    }
}
