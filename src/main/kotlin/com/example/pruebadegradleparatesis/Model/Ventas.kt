package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*


@Entity
@Table(name="Ventas")
class Ventas(
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var trsnid: Int = -1





) {


}
