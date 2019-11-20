package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name="Rol")
@JsonIgnoreProperties (ignoreUnknown =  true )

class Rol(

        @Column
        val rolnombre: String,

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var rolid:Int=-1


)  {

    constructor():this("")
}
