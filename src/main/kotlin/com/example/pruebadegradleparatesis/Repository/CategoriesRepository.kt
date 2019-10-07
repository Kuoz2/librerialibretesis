package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Categories
import org.springframework.data.jpa.repository.JpaRepository

interface CategoriesRepository:JpaRepository<Categories,Long> {

}
