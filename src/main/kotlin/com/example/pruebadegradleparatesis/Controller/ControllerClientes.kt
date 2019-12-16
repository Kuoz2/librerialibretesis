package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Cliente
import com.example.pruebadegradleparatesis.Repository.ClienteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/clientes")
class ControllerClientes {

    @Autowired
    lateinit var clien: ClienteRepository

    @GetMapping
    fun tomarclientes(): MutableList<Cliente> {
        return clien.findAll()
    }

    @PostMapping
    fun guardarcliente(@RequestBody @Valid c: Cliente):Cliente{
        return clien.save(c)
    }
}
