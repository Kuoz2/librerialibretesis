package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.*
import org.springframework.data.jpa.repository.Query
import javax.persistence.*

@Entity
@Table(name = "Productos")
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


        @ManyToOne( fetch = FetchType.LAZY)
        @JsonBackReference(value = "categorias_producto")
        @JoinColumn(name = "catid", nullable = false)
        val categories: Categorias? = null,

        @ManyToOne(fetch = FetchType.LAZY)
        @JsonBackReference(value = "marcas_producto")
        @JoinColumn(name = "mid", nullable = false)
        val brands: Marca? = null,

        @OneToMany(mappedBy = "reservado",fetch = FetchType.EAGER, cascade = [CascadeType.ALL])
        @JsonBackReference(value = "reservaproducto")
        val reservando: List<Reserva> = arrayListOf() ,

        @OneToMany(mappedBy = "productos",fetch = FetchType.EAGER)
        @JsonBackReference(value = "detalle_product")
        val detallevoucher: List<DetalleVoucher> = arrayListOf() ,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var pid:Int=-1
) {

    constructor():this(0,"","",0,0,0,false,false)
}
