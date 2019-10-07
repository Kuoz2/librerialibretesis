package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*
import javax.print.DocFlavor

@Entity
@Table(name = "categories")
@JsonIgnoreProperties("person")

class Categories(
        @Column
        val name_category:String,
        @Column
        val description:String,
        @OneToMany(mappedBy="categories", cascade = arrayOf(CascadeType.MERGE),fetch = FetchType.EAGER)
        @JsonManagedReference(value = "categories_product")
        val products: List<Products> = emptyList(),
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val caId:Long = -1
){
    override fun toString(): String {
        return "persona:${products.map { it ->it.pId}}"
    }

    constructor():this("","")
}
