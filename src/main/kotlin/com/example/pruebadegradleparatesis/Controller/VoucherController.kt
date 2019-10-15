package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categorias
import com.example.pruebadegradleparatesis.Model.Voucher
import com.example.pruebadegradleparatesis.Repository.VoucherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/voucher")
class VoucherController {

    @Autowired
    lateinit var voucher:VoucherRepository

    @GetMapping
    fun listar():List<Voucher>{
        return voucher.findAll()
    }
    @PostMapping
    fun agregar( @RequestBody v: Voucher): Voucher
    {
        return voucher.save(v)
    }
}
