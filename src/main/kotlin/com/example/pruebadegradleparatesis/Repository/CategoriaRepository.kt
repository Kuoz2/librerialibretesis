package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Categorias
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriaRepository:JpaRepository<Categorias,Long> {
}
