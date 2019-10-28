package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Pagos
import org.springframework.data.jpa.repository.JpaRepository

interface PagosRepository:JpaRepository<Pagos,Long> {
}
