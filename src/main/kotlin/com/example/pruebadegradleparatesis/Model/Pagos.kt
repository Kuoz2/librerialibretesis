package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JacksonAnnotation
import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name="Pagos")
class Pagos(
        @Column
        val pagoventa:String,
        @Column
        val pagomonto:Int,
        @Column
        val pagovuelto:Int,
        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "medio_pago")
        @JoinColumn(name = "mpid", nullable = false)
        val mediopago: Medio? = null,

        @ManyToOne
        @JsonBackReference(value = "ventas_pagos")
        @JoinColumn(name = "trsnid", nullable = true)
        val ventas: Ventas? = null,

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pagoid: Int = -1

) {
    constructor():this("",0,0)
}
