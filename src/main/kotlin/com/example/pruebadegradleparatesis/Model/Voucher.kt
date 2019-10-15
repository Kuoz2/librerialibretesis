package com.example.pruebadegradleparatesis.Model



import org.springframework.format.annotation.DateTimeFormat
import java.sql.Timestamp
import java.time.LocalDate

import java.util.*
import javax.persistence.*
@Entity
@Table(name="Voucher")
class Voucher(
        @Column
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE, pattern = "dd-MM-yyyy")
        val vemision: LocalDate,
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
    constructor():this(LocalDate.now(),
            0,
            0,
            0
    )
}
