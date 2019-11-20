package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "MedioPago")
class Medio(
        @Column
        val mpnombre:String,

        @OneToMany(mappedBy="mediopago",fetch = FetchType.EAGER)
        @JsonManagedReference(value = "medio_pago")
        @JsonIgnore
        val pagos: List<Pagos> = arrayListOf(),

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1
) {
}
