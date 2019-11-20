package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "Categorias")
@JsonIgnoreProperties(ignoreUnknown =  true )
class Categorias(
        @Column
        var cnombre:String,

        @OneToMany(mappedBy="categories",fetch = FetchType.EAGER)
        @JsonManagedReference(value = "categorias_producto")
        val products: List<Productos> = emptyList(),


        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var caid:Long = -1
) {
    override fun toString(): String {
        return "persona:${products.map { it ->it.pcodigo}}"
    }

    constructor():this("")
}
