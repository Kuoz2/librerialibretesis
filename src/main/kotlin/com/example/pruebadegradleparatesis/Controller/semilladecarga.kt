package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categorias
import com.example.pruebadegradleparatesis.Model.Marca
import com.example.pruebadegradleparatesis.Model.Productos
import com.example.pruebadegradleparatesis.Repository.CategoriaRepository
import com.example.pruebadegradleparatesis.Repository.MarcaRepository
import com.example.pruebadegradleparatesis.Repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cemilla")
class semilladecarga {


    @Autowired
    lateinit var categorias: CategoriaRepository
    @Autowired
    lateinit var marca: MarcaRepository
    @Autowired
    lateinit var productos: ProductoRepository

    @GetMapping
    fun verproductos(): MutableList<Productos> {
        return productos.findAll()
    }


    @RequestMapping("/guardar")
    fun guardarcemilla(): Productos{
        val a = Categorias("Papel")
        val b = Marca("ARTEL")
        val c = Productos(2007,
                "PLIEGO CARTULINAS DE COLORES",
                "Pliegos",
                280,
                1600,
                1600,
                true,
                true,
                a,
                b)


             return   productos.save(c)

    }
}
