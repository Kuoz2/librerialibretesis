package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "DetalleVoucher")
class DetalleVoucher(
        @Column
        val dvcantidad:Int,
        @Column
        val dvprecio:Int,
        @Column
        @ManyToOne( fetch = FetchType.LAZY)
        @JsonManagedReference(value = "detalle_voucher")
        @JoinColumn(name ="vnumero", nullable = false)
        val voucher: Voucher? = null,
        @Column
        @ManyToOne(fetch = FetchType.LAZY)
        @JsonManagedReference(value = "detalle_product")
        @JoinColumn(name = "pid", nullable = false)
        val productos: Productos?= null,

@Id
@GeneratedValue(strategy = GenerationType.AUTO )
val dvid:Int = -1
){
    constructor():this(0, 0)
}
