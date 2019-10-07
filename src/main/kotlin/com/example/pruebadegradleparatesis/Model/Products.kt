package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "products")
class Products(
        @Column
        val pCodigo:Long,
        @Column
        val pDescripcion:String,
        @Column
        val pDetalle:String,
        @Column
        val pValor:Long,
        @Column
        val pStock:Long,
        @Column
        val pStockseguridad:Long,
        @Column
        val Image: String,
        @Column
        val pVCatalogo :Boolean,
        @Column
        val pActivado: Boolean,
        @Column
        val pPromocion: Boolean,
        @ManyToOne(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.MERGE))
        @JsonBackReference(value = "categories_product")
        @JoinColumn(name = "category_id", nullable = false)
        val categories: Categories? = null,
        @ManyToOne(fetch = FetchType.LAZY, cascade = arrayOf(CascadeType.MERGE))
        @JsonBackReference(value = "brands_product")
        @JoinColumn(name = "brand_id", nullable = false)
        val brands: brands? = null,
        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val pId:Long=-1
) {
 constructor():this(
          0
         ,""
         ,""
         ,0
         ,0
         ,0
         ,""
         ,false
         ,false
         ,false)
}
