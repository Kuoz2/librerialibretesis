package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.brands
import org.springframework.data.jpa.repository.JpaRepository

interface BrandsRepository:JpaRepository<brands,Long> {
}
