package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categories
import com.example.pruebadegradleparatesis.Model.brands
import com.example.pruebadegradleparatesis.Repository.BrandsRepository
import com.example.pruebadegradleparatesis.Repository.CategoriesRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/brands")
class ControllerBrands {
    @Autowired
    lateinit var brands: BrandsRepository

    @GetMapping
    fun listar():List<brands>{
        return brands.findAll()
    }
    @PostMapping
    fun agregar( @RequestBody c: brands): brands
    {
        return brands.save(c)
    }
}
