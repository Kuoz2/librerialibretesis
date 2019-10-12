package com.example.pruebadegradleparatesis.Model

import java.util.*
import javax.persistence.*
@Entity
@Table(name="Promociones")
class Promocion(
        @Column
        val prfechainicio: Calendar,
        @Column
        val prfechatermino: Calendar,
        @Column
        val prvalor:Int,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var prid:Int=-1
) {
    constructor():this(Calendar.getInstance(), Calendar.getInstance(),0)
}
