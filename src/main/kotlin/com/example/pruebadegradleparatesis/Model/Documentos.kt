package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name="Documentos")
class Documentos (
        var docnumero:String,
        var docurl: String,


        @ManyToOne
        @JsonBackReference(value = "ventas_documentos")
        @JoinColumn(name = "trsnid", nullable = true)
        val ventas: Ventas? = null,



        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var docid:Int = -1
){
    constructor():this("","")
}
