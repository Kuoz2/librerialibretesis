package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.DetalleVoucher
import com.example.pruebadegradleparatesis.Model.Productos
import com.example.pruebadegradleparatesis.Model.Voucher
import com.example.pruebadegradleparatesis.Repository.DetalleVocuherRepository
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




}
