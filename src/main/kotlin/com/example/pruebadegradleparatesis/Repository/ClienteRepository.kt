package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Cliente
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteRepository: JpaRepository<Cliente, Long> {
}
