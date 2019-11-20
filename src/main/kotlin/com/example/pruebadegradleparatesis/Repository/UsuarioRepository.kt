package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UsuarioRepository:JpaRepository<Usuario,Long> {
}
