package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import java.sql.Time
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name= "Reserva")
@JsonIgnoreProperties(ignoreUnknown =  true )
class Reserva(
        @Column
        var remision: Timestamp,
        @Column
        var rentrega: Timestamp,
        @Column
        var restado: String,
        @Column
        var rfaltante: Int,
        @Column
        var rtotal: Int,
        @Column
        var rcomentario: String,


        @OneToMany(mappedBy = "dreserva",fetch = FetchType.EAGER)
        @JsonBackReference(value = "detalle_reserva")
        @JsonIgnore
        val detallevoucher: List<DetalleReserva> = emptyList<DetalleReserva>(),

        @ManyToOne( fetch = FetchType.LAZY ,cascade = arrayOf(CascadeType.ALL))
        @JsonBackReference(value = "cliente_reserva")
        @JoinColumn(name ="clid")
        var cliente: Cliente? = null,

        @Column
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var rnumero:Int=-1


) {
}
