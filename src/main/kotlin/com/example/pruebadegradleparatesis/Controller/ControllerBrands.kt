package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Marca
import com.example.pruebadegradleparatesis.Repository.MarcaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/marca")
class ControllerBrands {
    @Autowired
    lateinit var brands: MarcaRepository

    @GetMapping
    fun listar():List<Marca>{
        return brands.findAll()
    }
    @PostMapping
    @ResponseBody
    fun agregar( @RequestBody c: Marca): Marca
    {
        return brands.save(c)
    }

    @PutMapping(path = ["/{id}"])
    fun editar( @PathVariable id:Long, @RequestBody p:Marca):Marca{
        p.mid = id
        return brands.saveAndFlush(p)
    }
}
