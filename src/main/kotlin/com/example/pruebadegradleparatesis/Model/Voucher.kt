package com.example.pruebadegradleparatesis.Model



import com.fasterxml.jackson.annotation.*
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import org.hibernate.annotations.LazyCollection
import org.hibernate.annotations.LazyCollectionOption
import org.springframework.data.repository.cdi.Eager

import javax.persistence.*
@Entity
@Table(name="Voucher")
@JsonIgnoreProperties(ignoreUnknown =  true )
class Voucher(

        @Column
        val vsubtotal:Int,
        @Column
        val vdescuento:Int,
        @Column
        val vtotal:Int,
        @Column
        val vnumerodebusqueda:Int,


        @OneToMany(mappedBy = "voucher",fetch = FetchType.EAGER)
        @JsonBackReference(value = "detalle_voucher")
        @JsonIgnore
        val detallevoucher: List<DetalleVoucher> = emptyList<DetalleVoucher>(),

        @OneToMany(mappedBy ="ventas", fetch = FetchType.EAGER,cascade= [CascadeType.ALL])
        @JsonManagedReference(value = "ventas_voucher")
        @Fetch(value = FetchMode.SUBSELECT)
        val ventavoucher: List<Ventas> = arrayListOf<Ventas>(),


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
