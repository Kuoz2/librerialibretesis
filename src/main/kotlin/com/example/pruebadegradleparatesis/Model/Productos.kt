package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import com.sun.xml.messaging.saaj.util.Base64
import javassist.bytecode.ByteArray
import org.hibernate.annotations.Fetch
import org.hibernate.annotations.FetchMode
import java.util.*

import javax.persistence.*
import kotlin.Byte.Companion.MAX_VALUE
import kotlin.Byte.Companion.SIZE_BYTES

@Entity
@Table(name = "Productos")
@JsonIgnoreProperties (ignoreUnknown =  true )

class Productos(
        @Column
        val pcodigo: Int,
        @Column
        val pdescripcion:String,
        @Column
        val pdetalle:String,
        @Column
        val pvalor:Int,
        @Column
        val pstock:Int,
        @Column
        val pstockseguridad: Int,
        @Column
        val pvcatalogo:Boolean,
        @Column

        val pactivado: Boolean,
        @Column
        var pictures: kotlin.ByteArray ,


        @ManyToOne( fetch = FetchType.LAZY)
        @JsonManagedReference(value = "categorias_producto")
        @JoinColumn(name = "catid", nullable = false)
        val categories: Categorias? = null,

        @ManyToOne(fetch = FetchType.LAZY )
        @JsonManagedReference(value = "marcas_producto")
        @JoinColumn(name = "mid", nullable = false)
        val brands: Marca? = null,

        @OneToMany(mappedBy ="dproductos", fetch = FetchType.EAGER)
        @JsonManagedReference(value = "detallereserva_product")
        val dproductos: List<DetalleReserva> = arrayListOf(),


        @OneToMany(mappedBy = "productos",fetch = FetchType.EAGER)
        @Fetch(value = FetchMode.SUBSELECT)
        @JsonBackReference(value = "detalle_product")
        val detallevoucher: List<DetalleVoucher> = arrayListOf(),

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pid:Long=-1
) {

    constructor():this(0,
            "",
            "",
            0,
            0,
            0,
            false,
            false,
                kotlin.ByteArray(0) )
}
