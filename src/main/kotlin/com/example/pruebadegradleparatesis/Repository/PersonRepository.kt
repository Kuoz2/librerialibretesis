package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Person
import org.springframework.data.jpa.repository.JpaRepository

interface PersonRepository:JpaRepository<Person,Long> {
}
