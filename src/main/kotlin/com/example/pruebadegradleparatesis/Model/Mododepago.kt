package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "Mododepago")
class Mododepago(
        @Column
        val mpnombre:String,

        @OneToMany(mappedBy = "mododepago",fetch = FetchType.LAZY)
        @JsonManagedReference(value = "mododepago_pago")
        val modopago: List<Pagos> = emptyList(),

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1
) {
    constructor():this("")
}
