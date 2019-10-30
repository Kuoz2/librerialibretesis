package com.example.pruebadegradleparatesis.Model

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

        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "ventas_pagos")
        @JoinColumn(name = "trsnid", nullable = false, referencedColumnName = "trsnid")
        val ventaspagos: Ventas? = null,

        @OneToMany(mappedBy = "pagos",fetch = FetchType.EAGER)
        @JsonManagedReference(value = "pagos_mediospago")
        val medio: List<Medio> = emptyList(),

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pagoid: Int = -1
) {
    constructor():this("",0)
}
