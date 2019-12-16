package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*

@Entity
@Table(name = "detallereserva")
class DetalleReserva(
       val drescantidad: Int,
       val dresprecio: Int,
       val drescheck: Boolean,

       @ManyToOne( fetch = FetchType.LAZY ,cascade = arrayOf(CascadeType.ALL))
       @JsonBackReference(value = "detalle_reserva")
       @JoinColumn(name ="rnumero")
        var dreserva: Reserva? = null,

        @ManyToOne(fetch = FetchType.LAZY,  cascade = [CascadeType.ALL])
        @JsonBackReference(value = "detallereserva_product")
        @JoinColumn(name = "pid")
        @JsonIgnore
        var dproductos: Productos?= null,

       @Id
       @GeneratedValue(strategy = GenerationType.AUTO )
       val dresid:Long = -1

) {
    constructor():this(0,0,false)
}
