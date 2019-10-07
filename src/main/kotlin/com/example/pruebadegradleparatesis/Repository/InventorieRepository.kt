package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Products
import org.springframework.data.jpa.repository.JpaRepository

interface InventorieRepository:JpaRepository<Products,Long> {
}
