package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Rol
import com.example.pruebadegradleparatesis.Repository.RolRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/rol")
class RolController {
    @Autowired
    lateinit var rol: RolRepository

    @GetMapping
    fun mostraroles(): MutableList<Rol> {
        return rol.findAll()
    }

    @PostMapping
    fun guardarol(@RequestBody r:Rol):Rol{
        return rol.save(r)
    }
}
