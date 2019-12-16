package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.DetalleReserva
import org.springframework.data.jpa.repository.JpaRepository

interface DetalleRepository: JpaRepository<DetalleReserva, Long> {
}
