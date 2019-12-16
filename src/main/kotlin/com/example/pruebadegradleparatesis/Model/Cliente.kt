package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "cliente")
class Cliente(
        @Column
        val clrun: String,
        @Column
        val clnombre: String,
        @Column
        val clapellido: String,
        @Column
        val clfono: String,
        @Column
        val clcorreo: String,

        @OneToMany(mappedBy="cliente",fetch = FetchType.EAGER)
        @JsonManagedReference(value = "cliente_reserva")
        val reserva: List<Reserva> = emptyList(),

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var clid:Long = -1
) {
    constructor():this("","","","","")
}
