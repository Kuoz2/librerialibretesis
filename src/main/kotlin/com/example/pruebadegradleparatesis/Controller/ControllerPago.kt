package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Pagos
import com.example.pruebadegradleparatesis.Repository.PagosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@Controller
@RequestMapping("/pagos")
class ControllerPago {

    @Autowired
    lateinit var pagos: PagosRepository

    @GetMapping
    @ResponseBody
    fun todaslospagos(): MutableList<Pagos> {
        return pagos.findAll()
    }

    @PostMapping
    @ResponseBody
    fun realizarpago(@RequestBody @Valid p: Pagos): Pagos  {
            return pagos.save(p)
    }
}
