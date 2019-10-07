package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import org.springframework.format.annotation.NumberFormat
import javax.persistence.*

@Entity
@Table(name = "employee")
class Employee(

        @Column
        val Rol_employee : String?,


        @OneToMany(mappedBy="employee", cascade = arrayOf(CascadeType.MERGE),fetch = FetchType.EAGER)
        @JsonManagedReference(value = "person_employee")
        val personas:List<Person> = emptyList(),

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val Id: Int? = -1){

        override fun toString(): String {
                return "persona:${personas.map { it ->it.Rut}}"
        }

    constructor():this("")
}
