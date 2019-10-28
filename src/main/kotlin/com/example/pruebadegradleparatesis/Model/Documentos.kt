package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name="Documentos")
class Documentos (
        @Column
        var docnumero:String,
        @Column
        var docurl: String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JsonBackReference(value = "documentos_venta")
        @JoinColumn(name = "trsnid", nullable = false)
        val documento: Ventas? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var docid:Int = -1
){
    constructor():this("","")
}
