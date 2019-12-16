package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Ventas
import com.example.pruebadegradleparatesis.Repository.VentasRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/ventas")
class ControllerVentas {
    @Autowired
    lateinit var ventas:VentasRepository


    @GetMapping
    fun todaslaventas(): List<Ventas> {
        return ventas.findAll()
    }

    @PostMapping
    fun guardarventa( @RequestBody @Valid vnt: Ventas): Ventas {

        return ventas.save(vnt)
    }
}
