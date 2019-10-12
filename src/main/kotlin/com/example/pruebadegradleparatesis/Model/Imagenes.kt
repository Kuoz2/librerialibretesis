package com.example.pruebadegradleparatesis.Model

import javax.persistence.*

@Entity
@Table(name = "Imagenes")
class Imagenes(
        val iurl:String,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var iid:Int=-1
) {
}
