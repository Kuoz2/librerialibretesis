package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Medio
import org.springframework.data.jpa.repository.JpaRepository

interface ModoRepository:JpaRepository<Medio,Int> {
}
