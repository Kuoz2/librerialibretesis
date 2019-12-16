package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.DetalleReserva
import com.example.pruebadegradleparatesis.Repository.DetalleRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/detallereserva")
class ControllerDetalleReserva {

    @Autowired
    lateinit var detalleres: DetalleRepository

    @GetMapping
    fun todoslosdetallereservados(): MutableList<DetalleReserva>{
        return detalleres.findAll()
    }

    @PostMapping
    fun guardardetallereservado( @RequestBody @Valid dr: DetalleReserva ):DetalleReserva{
        return detalleres.save(dr)
    }
}
