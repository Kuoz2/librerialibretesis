package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Categorias
import com.example.pruebadegradleparatesis.Model.Voucher
import com.example.pruebadegradleparatesis.Repository.VoucherRepository
import jdk.jfr.ContentType
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.web.ResourceProperties
import org.springframework.format.annotation.DateTimeFormat
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.awt.PageAttributes


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
    fun agregar( @RequestBody  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd-MM-yyyy") v: Voucher): Voucher
    {
        return voucher.save(v)
    }
}
