package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.*
import com.example.pruebadegradleparatesis.Repository.DetalleVocuherRepository
import com.example.pruebadegradleparatesis.Repository.VoucherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/voucher")
class VoucherController {

    @Autowired
    lateinit var voucherrepository: VoucherRepository
    @Autowired
    lateinit var detallevoucherrepository: DetalleVocuherRepository
    @GetMapping
    fun listar(): List<Voucher> {

        return voucherrepository.findAll()
    }

    @PostMapping
    fun agregar(@RequestBody @Valid v: Voucher): Voucher {
        return voucherrepository.save(v)
    }



}
