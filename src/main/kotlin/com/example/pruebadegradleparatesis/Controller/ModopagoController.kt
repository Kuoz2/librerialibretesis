package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Medio
import com.example.pruebadegradleparatesis.Repository.ModoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/modopago")
class ModopagoController {
    @Autowired
    lateinit var mododepago: ModoRepository

    @GetMapping
    fun todoslosmetododepago(): MutableList<Medio> {
        return mododepago.findAll()
    }
    @PostMapping
    fun guardarmododepago(@RequestBody m:Medio):Medio{
        return mododepago.save(m)
    }


    @RequestMapping("/formapago")
        fun Pguardarforma():Medio{
        val m = Medio("Tarjeta")
            return mododepago.save(m)
        }

}
