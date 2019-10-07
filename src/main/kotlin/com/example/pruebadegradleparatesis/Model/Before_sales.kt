package com.example.pruebadegradleparatesis.Model

import java.util.*
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

class Before_sales(
        val before_code_sale:Long,
        val quantity_sale:Long,
        val total_sale:Long,
        val hour_sale:String,
        val create_in:Calendar,
        val code_baucher:Long,
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val Id:Long =-1
){
constructor():this(0,0,0,"", Calendar.getInstance(),0)
}
