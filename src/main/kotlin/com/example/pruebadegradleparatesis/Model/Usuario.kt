package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import javax.persistence.*

@JsonIgnoreProperties (ignoreUnknown =  true )
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
        val ucontrasenia:String,

        @ManyToOne( fetch = FetchType.LAZY ,cascade= [CascadeType.MERGE])
        @JsonBackReference(value = "rolusuario")
        @JoinColumn(name ="rolid")
        @JsonProperty("rol")
        var rol: Rol? = null,



        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var uid:Long=-1


) {
    constructor():this("","","","",0,"","","","")
}



