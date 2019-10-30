package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "Mododepago")
class Mododepago(
        val mpnombre:String,

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1,
        @OneToMany(mappedBy="mododepago",fetch = FetchType.LAZY)
@JsonManagedReference(value = "modopago")
var moodopagos: List<Pagos> = emptyList()
) {
    constructor():this("")
}
