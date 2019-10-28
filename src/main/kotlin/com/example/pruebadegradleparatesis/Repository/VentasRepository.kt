package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Ventas
import org.springframework.data.jpa.repository.JpaRepository

interface VentasRepository:JpaRepository<Ventas,Long> {
}
