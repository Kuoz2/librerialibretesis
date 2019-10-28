package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name = "DetalleVoucher")
class DetalleVoucher(
        @Column
        val dvcantidad:Int,
        @Column
        val dvprecio:Int,
        @ManyToOne( fetch = FetchType.EAGER,cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference(value = "detalle_voucher")
        @JoinColumn(name ="vnumero")
        var voucher: Voucher? = null,
        @ManyToOne(fetch = FetchType.EAGER)
        @JsonBackReference(value = "detalle_product")
        @JoinColumn(name = "pid")
        var productos: Productos?= null,

        @Id
@GeneratedValue(strategy = GenerationType.AUTO )
        val dvid:Int = -1
){
    constructor():this(0, 0)
}
