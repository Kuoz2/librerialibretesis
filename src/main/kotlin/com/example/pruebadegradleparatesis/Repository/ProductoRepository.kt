package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Productos
import org.springframework.data.jpa.repository.JpaRepository

interface ProductoRepository: JpaRepository<Productos,Long>{}
