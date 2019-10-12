package com.example.pruebadegradleparatesis.Model

import javax.persistence.*
@Entity
@Table(name="Proveedor")
class Proveedor(
        @Column
        val pronombre:String,
        @Column
        val prorut:String,
        @Column
        val prodni:Int,
        @Column
        val profono:Int,
        @Column
        val procorreo:String,
        @Column
        val prodireccion:String,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var proid:Int=-1

) {
    constructor():this("","",0,0,"","")
}
