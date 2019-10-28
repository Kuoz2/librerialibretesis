package com.example.pruebadegradleparatesis.Model

import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.persistence.*

@Entity
@Table(name= "Ventas")
class Ventas(
        @OneToMany(mappedBy = "ventas", fetch = FetchType.EAGER)
        @JsonManagedReference(value = "venta_voucher")
        var ventavoucher: List<Voucher> = emptyList(),

        @OneToMany(mappedBy = "ventas",fetch = FetchType.EAGER, cascade = [CascadeType.MERGE])
        @JsonManagedReference(value = "documentos_venta")
        val documento: List<Documentos> = emptyList(),

        @OneToMany(mappedBy = "ventas",fetch = FetchType.EAGER, cascade = [CascadeType.MERGE])
        @JsonManagedReference(value = "pago_venta")
        val pago_Venta: List<Pagos> = emptyList(),

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var trsnid: Int = -1


) {
}
