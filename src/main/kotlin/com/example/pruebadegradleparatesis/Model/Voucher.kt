package com.example.pruebadegradleparatesis.Model



import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonManagedReference

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

        @OneToMany(mappedBy = "voucher",fetch = FetchType.EAGER, cascade = [CascadeType.MERGE])
        @JsonManagedReference(value = "detalle_voucher")
        val detallevoucher: List<DetalleVoucher> = emptyList(),


        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "ventas_voucher")
        @JoinColumn(name = "trsnid", nullable = false, referencedColumnName = "trsnid")
        val ventas: Ventas? = null,

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
