package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "MedioPago")
class Medio(
        @Column
        val mpnombre:String,

        @ManyToOne(fetch = FetchType.LAZY)
        @JsonBackReference(value = "pagos_mediospago")
        @JoinColumn(name = "pagoid")
        val modopago: Pagos? = null,

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1
) {
}
