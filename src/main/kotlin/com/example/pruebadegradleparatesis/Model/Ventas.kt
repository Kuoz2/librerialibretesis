package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import org.hibernate.annotations.Cascade
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import javax.persistence.*


@Entity
@Table(name="Ventas")
class Ventas(

        @OneToMany(mappedBy = "ventas", fetch = FetchType.EAGER )
        @JsonManagedReference(value = "ventas_documentos")
        @Fetch(value = FetchMode.SUBSELECT)
        @JsonFormat(with = [JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY])

        val ventasdocumento: List<Documentos> = arrayListOf<Documentos>(),

        @OneToMany(mappedBy ="ventas", fetch = FetchType.EAGER)
        @JsonManagedReference(value = "ventas_pagos")
        @Fetch(value = FetchMode.SUBSELECT)
        @JsonFormat(with = [JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY])
        val ventapago: List<Pagos> = arrayListOf<Pagos>(),

        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "ventas_voucher")
        @JoinColumn(name = "vnumero", nullable = true)
        @JsonIgnoreProperties("ventas")
        val ventas: Voucher? = null,

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var trsnid: Int = -1





) {
constructor():this(arrayListOf())

}
