package com.example.pruebadegradleparatesis.Model



import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.format.annotation.DateTimeFormat
import java.lang.ref.Reference
import java.time.LocalDate

import java.util.*
import javax.persistence.*
@Entity
@Table(name="Voucher")
class Voucher(

        @Column
        val vsubtotal:Int,
        @Column
        val vdescuento:Int,
        @Column
        val vtotal:Int,
        @OneToMany(mappedBy = "voucher",fetch = FetchType.EAGER)
        val detallevoucher: List<DetalleVoucher> = emptyList(),
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var vnumero:Int =  -1
)

{
    constructor():this(
            0,
            0,
            0
    )
}
