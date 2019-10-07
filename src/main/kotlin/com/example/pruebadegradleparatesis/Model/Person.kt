package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import java.text.DateFormat
import java.util.*
import javax.persistence.*


@Entity @Table(name = "person")
class Person( @Column
              val firstName:String,
              @Column
              val lastName:String,
              @Column
              val Rut:String,
              @Column
              val Phone: Int,
              @Column
              val Emai: String,

              @ManyToOne(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.MERGE))
              @JsonBackReference(value = "person_employee")
              @JoinColumn(name = "employee_id", nullable = false)
              val employee: Employee? = null,



              @Id
              @GeneratedValue(strategy = GenerationType.AUTO)
              val Id:Int=-1) {
    constructor():this("","","",0,"")

}




