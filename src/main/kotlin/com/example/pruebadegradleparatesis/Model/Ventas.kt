package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*


@Entity
@Table(name="Ventas")
class Ventas(


        @OneToMany(mappedBy = "ventas")
        @JsonBackReference(value = "ventas_pagos")
        val ventaspagos: List<Pagos> = arrayListOf(),

        @OneToMany(mappedBy = "ventas")
        @JsonBackReference(value = "ventas_documentos")
        val ventasdocumento: List<Documentos> = arrayListOf(),

        @OneToMany(mappedBy = "ventas")
        @JsonBackReference(value = "ventas_voucher")
        val ventavoucher: List<Voucher> = arrayListOf(),


        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var trsnid: Int = -1





) {


}
