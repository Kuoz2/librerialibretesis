package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import javax.persistence.*

@Entity
@Table(name="Documentos")
@JsonIgnoreProperties(ignoreUnknown =  true )

class Documentos (
        var docnumero:String,
        var docurl: String,


        @ManyToOne(fetch = FetchType.EAGER)
        @JsonBackReference(value = "ventas_documentos")
        @JoinColumn(name = "trsnid", nullable = false)

        val ventas: Ventas? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var docid:Int = -1
){
    constructor():this("","")
}
