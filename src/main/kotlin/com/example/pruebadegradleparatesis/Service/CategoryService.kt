package com.example.pruebadegradleparatesis.Service

import com.example.pruebadegradleparatesis.Model.Categories

interface CategoryService {

    fun listar(): List<Categories>
    fun listarId(id: Long): Categories
    fun add(c: Categories):Categories
    fun edit(c: Categories):Categories
    fun delete(id: Long):Categories
}
