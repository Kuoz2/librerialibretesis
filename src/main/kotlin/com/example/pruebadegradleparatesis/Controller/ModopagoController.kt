package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Repository.ModoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/modopago")
class ModopagoController {
    @Autowired
    lateinit var mododepago: ModoRepository

    @GetMapping
    fun todoslosmetododepago(){
        mododepago.findAll()
    }
}
