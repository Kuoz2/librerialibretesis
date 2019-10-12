package com.example.pruebadegradleparatesis.Model

import javax.persistence.*

@Entity
@Table(name = "Mododepago")
class Mododepago(
        @Column
        val mpnombre:String,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var mpid:Int=-1
) {
    constructor():this("")
}
