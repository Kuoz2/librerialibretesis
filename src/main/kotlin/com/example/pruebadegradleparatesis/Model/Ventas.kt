package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*


@Entity
@Table(name="Ventas")
class Ventas(

        @OneToMany(mappedBy = "ventas", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JsonBackReference(value = "ventas_documentos")
        val ventasdocumento: List<Documentos> = arrayListOf<Documentos>(),

        @OneToMany(mappedBy ="ventas", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JsonBackReference(value = "ventas_pagos")
        val ventapago: List<Pagos> = arrayListOf<Pagos>(),

        @OneToMany(mappedBy ="ventas",fetch = FetchType.EAGER ,cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference(value = "ventas_voucher")
        @JsonIgnore
        val ventavoucher: List<Voucher> = arrayListOf<Voucher>(),



        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var trsnid: Int = -1





) {


}
