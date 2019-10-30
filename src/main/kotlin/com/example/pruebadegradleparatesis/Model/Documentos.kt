package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name="Documentos")
class Documentos (
        var docnumero:String,
        var docurl: String,


        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "ventas_documentos")
        @JoinColumn(name = "trsnid", nullable = false, referencedColumnName = "trsnid")
        val ventasdocumentos: Ventas? = null,


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var docid:Int = -1
){
    constructor():this("","")
}
