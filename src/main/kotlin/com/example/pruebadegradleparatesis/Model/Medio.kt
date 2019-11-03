package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "MedioPago")
class Medio(
        @Column
        val mpnombre:String,
        @OneToMany(mappedBy = "mediopago")
        @JsonBackReference(value = "medio_pago")
        val mediopagos: List<Pagos> = arrayListOf(),
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1
) {
}
