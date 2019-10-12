package com.example.pruebadegradleparatesis.Model

import javax.persistence.*
@Entity
@Table(name = "Usuario")
class Usuario(
        @Column
        val urun:String,
        @Column
        val unombre:String,
        @Column
        val uapellidop:String,
        @Column
        val uapellidom:String,
        @Column
        val ufono:Int,
        @Column
        val ucorreo:String,
        @Column
        val unacionalidad:String,
        @Column
        val udireccion:String,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var uid:Int=-1

) {
    constructor():this("","","","",0,"","","")
}
