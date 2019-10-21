package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Imagenes
import org.springframework.data.jpa.repository.JpaRepository

interface ImagenesRepository:JpaRepository<Imagenes,Int> {


}
