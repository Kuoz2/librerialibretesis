package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categories
import com.example.pruebadegradleparatesis.Model.Products
import com.example.pruebadegradleparatesis.Model.brands
import com.example.pruebadegradleparatesis.Repository.InventorieRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/productis")
class ControllerProducts {

    @Autowired
    lateinit var products: InventorieRepository

    @GetMapping
    fun allProducts():List<Products>{
        return products.findAll()
    }

    @PostMapping
    fun guardarProducto(@Valid @RequestBody c:Products = Products(), e:Categories= Categories(),d:brands= brands() ): Products {
        val datos = Products(
                c.pCodigo,
                c.pDescripcion,
                c.pDetalle,
                c.pValor,
                c.pStock,
                c.pStockseguridad,
                c.Image,
                c.pVCatalogo,
                c.pActivado,
                c.pPromocion,e,d )
    return products.save(datos)
    }
}
