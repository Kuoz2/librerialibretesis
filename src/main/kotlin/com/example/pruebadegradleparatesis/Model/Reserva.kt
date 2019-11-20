package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name= "Reserva")
@JsonIgnoreProperties(ignoreUnknown =  true )
class Reserva(
        @Column
        var drescantidad: Int,
        @Column
        var dresprecio: Int,
        @Column
        var dreservado: Boolean,

        @ManyToOne( fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
        @JsonBackReference(value = "reservaproducto")
        @JoinColumn(name = "pid", nullable = false)
        val reservado: Productos? = null,

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var rnumero:Int=-1


) {
    constructor():this(0,0,false)
}
