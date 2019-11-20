package com.example.pruebadegradleparatesis.Model



import com.fasterxml.jackson.annotation.*

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
        @Column
        val vnumerodebusqueda:Int,

        @OneToMany(mappedBy = "voucher",fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        @JsonBackReference(value = "detalle_voucher")
        @JsonIgnore
        val detallevoucher: List<DetalleVoucher> = emptyList<DetalleVoucher>(),



        @ManyToOne(fetch = FetchType.LAZY ,cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference(value = "ventas_voucher")
        @JoinColumn(name = "trsnid", nullable = true)
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
            0,
            0
    )
}
