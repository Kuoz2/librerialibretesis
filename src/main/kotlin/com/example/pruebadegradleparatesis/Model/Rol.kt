package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import javax.persistence.*

@Entity
@Table(name="Rol")
@JsonIgnoreProperties (ignoreUnknown =  true )

class Rol(
  @Column

  @JsonProperty("rolnombre")
  val rolnombre: String,
  @OneToMany(mappedBy = "rol",fetch = FetchType.EAGER,cascade= [CascadeType.ALL])
  @JsonBackReference(value = "rolusuario")
  @JsonProperty("usuario")
  val usuario: List<Usuario> = arrayListOf<Usuario>(),
  @Column
  @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var rolid:Int=-1



)  {

    constructor():this("")
}
