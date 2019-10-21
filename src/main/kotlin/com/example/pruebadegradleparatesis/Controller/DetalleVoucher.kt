package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Voucher
import com.example.pruebadegradleparatesis.Repository.DetalleVocuherRepository
import com.example.pruebadegradleparatesis.Repository.VoucherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/detallevoucher")
class DetalleVoucher {
    @Autowired
    lateinit var detallevoucher: DetalleVocuherRepository

    @GetMapping
    fun listar(): MutableList<com.example.pruebadegradleparatesis.Model.DetalleVoucher> {

        return detallevoucher.findAll()
    }
    @PostMapping
    fun agregardetallevoucher(@RequestBody detalle: DetalleVoucher): com.example.pruebadegradleparatesis.Model.DetalleVoucher {
        return detallevoucher.save(detalle)
    }
}
