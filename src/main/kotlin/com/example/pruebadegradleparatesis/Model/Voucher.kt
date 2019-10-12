package com.example.pruebadegradleparatesis.Model

import org.graalvm.compiler.debug.TimeSource
import org.springframework.format.annotation.DateTimeFormat
import java.sql.Date
import java.sql.Time
import java.sql.Timestamp
import java.time.Month
import java.time.Year
import java.time.YearMonth
import java.util.*
import javax.persistence.*
@Entity
@Table(name="Voucher")
class Voucher(
        @Column
        @Temporal(TemporalType.TIME)
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
