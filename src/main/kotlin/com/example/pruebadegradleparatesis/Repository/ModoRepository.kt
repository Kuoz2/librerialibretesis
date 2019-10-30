package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Mododepago
import org.springframework.data.jpa.repository.JpaRepository

interface ModoRepository:JpaRepository<Mododepago,Int> {
}
