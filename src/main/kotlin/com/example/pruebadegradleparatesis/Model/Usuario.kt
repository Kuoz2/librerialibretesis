package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonManagedReference
import com.fasterxml.jackson.annotation.JsonProperty
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
        @ManyToMany(fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        @JoinTable(name = "usuario_rol",
                joinColumns = [JoinColumn(name = "uid", referencedColumnName = "uid")],
                inverseJoinColumns = [JoinColumn(name = "rolid", referencedColumnName = "rolid")])
        @JsonFormat(with = [JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY])
        var rol: List<Rol> = arrayListOf(),
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var uid:Long=-1


) {
    constructor():this("","","","",0,"","","","")
}



