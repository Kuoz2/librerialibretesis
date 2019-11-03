package com.example.pruebadegradleparatesis.Model

import javax.persistence.*

@Entity
@Table(name="Rol")
class Rol(
        val rolnombre:String,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var rolid:Int=-1


)  {
    constructor():this("")
}
