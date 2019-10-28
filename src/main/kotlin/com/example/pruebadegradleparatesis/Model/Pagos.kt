package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name="Pagos")
class Pagos(
        val pagostventa:String,
        val pagomonto:Int,
        @ManyToOne(fetch = FetchType.LAZY)
        @JsonBackReference(value = "pago_venta")
        @JoinColumn(name = "trnsid", nullable = false)
        val pagoventa: Ventas? = null,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pagoid: Int = -1
) {
    constructor():this("",0)
}
