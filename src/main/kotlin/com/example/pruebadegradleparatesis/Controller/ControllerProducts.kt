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
import javax.persistence.EntityManager
import javax.persistence.EntityManagerFactory
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/productos")

class ControllerProducts {

    @Autowired
    lateinit var products: ProductoRepository



    @GetMapping
    fun allProducts(): List<Productos>{
        return products.findAll()
    }

@PostMapping
    fun guardarProducto(@RequestBody @Valid datos:Productos):Productos {
    /*    val datoscategories = Categorias(cnombre = "Cartulina Actualizado",caid =1 )
        val datosmarca = Marca(mnombre = "Alcatel",mid = 2)
        val datos = Productos(
                pcodigo = 212,
                pdescripcion = "dasda",
                pdetalle = "dsad",
                pvalor = 32,
                pstock = 100,
                pstockseguridad = 100,
                pvcatalogo =  false,
                pactivado = true,
                categories = datoscategories,
                brands = datosmarca)*/
         return products.save(datos)
    }

    @PutMapping(path = ["/{id}"])
    fun editar( @PathVariable id:Long, @RequestBody p:Productos):Productos{
        p.pid = id.toInt()
        return products.saveAndFlush(p)
    }
    @GetMapping( path = ["/{id}"])
    fun Actualizarcategoria(@PathVariable("id") id:Long): Productos{
        return products.getOne(id)
    }

  /* @RequestMapping("/pruebaguardado")
    fun Guardarunproductomanual(){
        val guardadocategoria = Categorias("Lápiz ")
        val guardadatosmarca = Marca( "Bic")
            marcas.save(guardadatosmarca)
            categorias.save(guardadocategoria)


        val guardandoproductos = Productos(1616513,
                "boligrafo bic extra comfort",
                "De larga duración, barril translúcido",
                500,
                36,
                0,
                true,
                true, guardadocategoria,guardadatosmarca)

        products.save(guardandoproductos)

    }*/
}
