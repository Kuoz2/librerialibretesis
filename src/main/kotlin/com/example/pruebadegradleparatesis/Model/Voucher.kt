package com.example.pruebadegradleparatesis.Model


import org.springframework.format.annotation.DateTimeFormat
import java.sql.Date
import java.time.LocalTime
import java.util.*
import javax.persistence.*
@Entity
@Table(name="Voucher")
class Voucher(

        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
        val vemision:java.util.Date ,
        @Column
        val vsubtotal:Int,
        @Column
        val vdescuento:Int,
        @Column
        val vtotal:Int,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var vid:Int=-1
) {
    constructor():this(Date() ,0,0,0)
}
