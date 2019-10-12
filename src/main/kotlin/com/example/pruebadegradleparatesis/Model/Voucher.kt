package com.example.pruebadegradleparatesis.Model


import java.sql.Date
import java.time.LocalTime
import java.util.*
import javax.persistence.*
@Entity
@Table(name="Voucher")
class Voucher(
        @Column
        @Temporal(TemporalType.DATE)
        val vemision:Calendar,
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
    constructor():this(Calendar.getInstance(),0,0,0)
}
