package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JacksonAnnotation
import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name="Pagos")
class Pagos(
        @Column
        val pagostventa:String,
        @Column
        val pagomonto:Int,

        @ManyToOne
        @JsonBackReference(value = "ventas_pagos")
        @JoinColumn(name = "trsnid", nullable = true)
        val ventaspagos: Ventas? = null,


        @ManyToOne
        @JsonBackReference(value = "pagos_medios")
        @JoinColumn(name = "mpid", nullable = true)
        val mediopago: Medio? = null,


        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pagoid: Int = -1
) {
    constructor():this("",0)
}
