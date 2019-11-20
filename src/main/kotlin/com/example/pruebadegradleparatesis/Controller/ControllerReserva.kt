package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Reserva
import com.example.pruebadegradleparatesis.Repository.ReservaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/reserva")
class ControllerReserva {

    @Autowired
    lateinit var reservar: ReservaRepository

    @GetMapping
    fun reservasproducto(): MutableList<Reserva> {
        return reservar.findAll()
    }

    @PostMapping
    fun guardarlareserva(@RequestBody r:Reserva):Reserva{
        return reservar.save(r)
    }
}
