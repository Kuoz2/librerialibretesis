package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*
@Entity
@Table(name="Marca")
class Marca(
        @Column
        val mnombre:String,
        @OneToMany(mappedBy="brands",fetch = FetchType.EAGER)
        @JsonManagedReference(value = "marcas_producto")
        val marca: List<Productos> = emptyList(),
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mid:Long= -1
) {
    override fun toString(): String {
        return "persona:${marca.map { it ->it.pcodigo}}"
    }

    constructor():this("")
}
