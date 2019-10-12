package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Marca
import org.springframework.data.jpa.repository.JpaRepository

interface MarcaRepository:JpaRepository<Marca,Long> {
}
