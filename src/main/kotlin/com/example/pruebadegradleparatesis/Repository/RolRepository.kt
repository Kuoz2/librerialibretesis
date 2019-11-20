package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Rol
import org.springframework.data.jpa.repository.JpaRepository

interface RolRepository:JpaRepository<Rol,Long> {
}
