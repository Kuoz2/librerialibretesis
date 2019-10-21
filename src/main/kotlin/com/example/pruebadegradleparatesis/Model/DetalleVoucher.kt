package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import javax.persistence.*

@Entity
@Table(name = "DetalleVoucher")
class DetalleVoucher(
        @Column
        val dvcantidad:Int,
        @Column
        val dvprescio:Int,
        @ManyToOne( fetch = FetchType.LAZY)
        @JoinColumn(name ="vnumero", nullable = false)
        val voucher: Voucher? = null,
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "pid", nullable = false)
        val productos: Productos?= null,

@Id
@GeneratedValue(strategy = GenerationType.AUTO )
val dvid:Int = -1
){
    constructor():this(0, 0)
}
