package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*
@Entity
@Table(name = "brands")
class brands(
        val name_brands:String,
        val fileName:String,
        val name_provider:String,
        @OneToMany(mappedBy="brands", cascade = arrayOf(CascadeType.MERGE),fetch = FetchType.EAGER)
        @JsonManagedReference(value = "brands_product")
        val brands: List<Products> = emptyList(),
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val mId:Long= -1
) {
    override fun toString(): String {
        return "persona:${brands.map { it ->it.pId}}"
    }

    constructor():this("","","")
}
