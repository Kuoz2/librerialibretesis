package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categorias
import com.example.pruebadegradleparatesis.Model.Marca
import com.example.pruebadegradleparatesis.Model.Productos
import com.example.pruebadegradleparatesis.Repository.CategoriaRepository
import com.example.pruebadegradleparatesis.Repository.MarcaRepository
import com.example.pruebadegradleparatesis.Repository.ProductoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/productos")

class ControllerProducts {

    @Autowired
    lateinit var products: ProductoRepository
    @Autowired
    lateinit var categorias: CategoriaRepository
    @Autowired
    lateinit var marcas: MarcaRepository

    @GetMapping
    fun allProducts():List<Productos>{
        return products.findAll()
    }

    @PostMapping

    fun guardarProducto(@RequestBody @Valid c:Productos, @RequestBody @Valid p:Categorias, @RequestBody @Valid b:Marca) {
        val datosc = Categorias(p.cnombre)
        val datosb = Marca(b.mnombre)
        val datos = Productos(c.pcodigo,c.pdetalle,c.pdescripcion,c.pvalor,c.pstock,c.pstockseguridad,c.pvcatalogo,c.pactivado,datosc,datosb)
         products.save(datos)
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

   /*@RequestMapping("/pruebaguardado")
    fun Guardarunproductomanual(){
        val guardadocategoria = Categories("Lápiz ","Intrumento de escritura" )
        val guardadatosmarca = brands( "Bic","Bolígrafo económico y desechable producido a gran escala ")



        val guardandoproductos = Products(1616513,
                "boligrafo bic extra comfort",
                "De larga duración, barril translúcido",
                500,
                36,
                "C:\\Users\\kuoz2\\Bibliotecas\\Imágenes\\lapiceros.jpg",
                true,
                true, guardadocategoria,guardadatosmarca)

        products.save(guardandoproductos)

    }*/
}
