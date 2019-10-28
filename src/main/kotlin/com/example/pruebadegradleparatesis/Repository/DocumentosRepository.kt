package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Documentos
import org.springframework.data.jpa.repository.JpaRepository

interface DocumentosRepository:JpaRepository<Documentos,Long> {
}
