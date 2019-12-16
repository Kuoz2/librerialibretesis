package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Documentos
import com.example.pruebadegradleparatesis.Repository.DocumentosRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@Controller
@RequestMapping("/documentos")
class ControllerDocumentos{


    @Autowired
    lateinit var documentos: DocumentosRepository

    @GetMapping
    @ResponseBody
  fun tomartododocumentos(): MutableList<Documentos> {
        return documentos.findAll()
    }
}
