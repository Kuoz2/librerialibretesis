package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name="Pagos")
class Pagos(
        val pagostventa:String,
        val pagomonto:Int,

        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "ventas_pagos")
        @JoinColumn(name = "trsnid", nullable = false, referencedColumnName = "trsnid")
        val ventaspagos: Ventas? = null,

        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "mododepago_pago")
        @JoinColumn(name = "mpid", nullable = false)
        val pagomodo: Mododepago? = null,


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pagoid: Int = -1
) {
    constructor():this("",0)
}
