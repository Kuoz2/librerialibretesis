package com.example.pruebadegradleparatesis.Repository

import com.example.pruebadegradleparatesis.Model.Employee
import org.springframework.data.jpa.repository.JpaRepository

interface EmployeeRepository:JpaRepository<Employee,Int> {
}