package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Reserva
import org.springframework.data.jpa.repository.JpaRepository

interface ReservaRepository:JpaRepository<Reserva,Long> {
}
