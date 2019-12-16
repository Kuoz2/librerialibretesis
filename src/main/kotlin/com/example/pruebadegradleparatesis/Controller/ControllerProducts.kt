package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categorias
import com.example.pruebadegradleparatesis.Model.Marca
import com.example.pruebadegradleparatesis.Model.Productos
import com.example.pruebadegradleparatesis.Repository.CategoriaRepository
import com.example.pruebadegradleparatesis.Repository.MarcaRepository
import com.example.pruebadegradleparatesis.Repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.data.jpa.repository.Query
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.validation.Valid
import javax.xml.bind.DatatypeConverter

@CrossOrigin(origins = ["http://localhost:4200"] ,maxAge = 3600)
@RestController
@RequestMapping("/productos")

class ControllerProducts {

    @Autowired
    lateinit var products: ProductoRepository
    @Autowired
    lateinit var marcas: MarcaRepository
    @Autowired
    lateinit var categorias: CategoriaRepository

    @GetMapping
    fun allProducts(): MutableList<Productos> {
     return products.findAll()
    }

@PostMapping
@ResponseBody

    fun guardarProducto(@RequestBody  datos:Productos):Productos {

    val decoder: ByteArray? = Base64.getEncoder().encode(datos.pictures)
    datos.pictures =  decoder!!
    return products.save(datos)
    }

    @PutMapping(path = ["/{id}"])
    fun editar( @PathVariable id:Long, @RequestBody p:Productos):Productos{
        return products.saveAndFlush(p)
    }

    @GetMapping( path = ["/{id}"])
    fun buscarproductoporid(@PathVariable("id") id:Long):Productos{
        return products.getOne(id)
    }





}

private fun Base64.Decoder.decode(pictures: Byte): Byte {
return pictures
}
