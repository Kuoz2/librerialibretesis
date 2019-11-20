package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import javax.persistence.*
@JsonIgnoreProperties(ignoreUnknown =  true )
@Entity
@Table(name = "DetalleVoucher")
class DetalleVoucher(
        @Column
        val dvcantidad:Int,
        @Column
        val dvprecio:Int,

        @ManyToOne( fetch = FetchType.LAZY ,cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference(value = "detalle_voucher")
        @JoinColumn(name ="vnumero")
        var voucher: Voucher? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        @JsonBackReference(value = "detalle_product")
        @JoinColumn(name = "pid")
        @JsonIgnore
        var productos: Productos?= null,

        @Id
@GeneratedValue(strategy = GenerationType.AUTO )
        val dvid:Long = -1
){
    constructor():this(0, 0)
}
