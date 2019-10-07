package com.example.pruebadegradleparatesis.Model

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "after_sales")
class After_sales(
                    @Column
                   val code_baucher:Long,
                   @Column
                   val payment:String,
                   @Column
                    val ballot_number:Long,
                    @Column
                    @Temporal(TemporalType.DATE)
                   val create_in:Calendar,
                   @Column
                    @Id
                   @GeneratedValue(strategy = GenerationType.AUTO)
                   val Id:Long= -1){
    constructor():this(0,"",0, Calendar.getInstance())

}
