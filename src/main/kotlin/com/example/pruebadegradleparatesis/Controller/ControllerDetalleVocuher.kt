package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.DetalleVoucher
import com.example.pruebadegradleparatesis.Model.Productos
import com.example.pruebadegradleparatesis.Model.Voucher
import com.example.pruebadegradleparatesis.Repository.DetalleVocuherRepository
import com.example.pruebadegradleparatesis.Repository.VentasRepository
import com.example.pruebadegradleparatesis.Repository.VoucherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/detallevoucher")
class ControllerDetalleVocuher {


    @Autowired
    lateinit var detalle: DetalleVocuherRepository

    @GetMapping
    fun listar():List<DetalleVoucher>{

        return detalle.findAll()
    }

    @PostMapping
    fun agregar( @RequestBody @Valid v: DetalleVoucher):DetalleVoucher
    {

        return detalle.save(v)
    }


    //Prurba ultima de voucher
    /* @RequestMapping("/guardardarosvoucher")
     @Transactional
     fun guardarpostvoucher():DetalleVoucher{
         val voucher = Voucher(12,12,12)
         val productos = Productos(52562652,"un nombre","enkjndkjas",74,10,10,false,false,pid = 3)
         val detallevoucher = DetalleVoucher(1,2,voucher,productos)


         return detallevoucherrepository.save(detallevoucher)
     }*/

}
