package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Employee
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.ArrayList
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMethod








@CrossOrigin()
@RestController
@RequestMapping( "/employees" )
class TestController {

    private val employees = createList()

    @RequestMapping(value = ["/mostraremployees"], method = [RequestMethod.GET], produces = ["application/json"])
    fun firstPage(): List<Employee> {
        return employees
    }


    @DeleteMapping(path = ["/{id}"])
    fun delete(@PathVariable("id") id: Int): Employee? {
        var deletedEmp: Employee? = null
        for (emp in employees) {
            if (emp.getEmpId()!!.equals(id)) {
                employees.remove(emp)
                deletedEmp = emp
                break
            }
        }
        return deletedEmp
    }

    @PostMapping
    fun create(@RequestBody user: Employee): Employee {
        employees.add(user)
        return user
    }

    fun createList(): MutableList<Employee> {
        val tempEmployees = ArrayList<Employee>()
        val emp1 = Employee()
        emp1.setName("emp1")
        emp1.setDesignation("manager")
        emp1.setEmpId("1")
        emp1.setSalary(3000.0)

        val emp2 = Employee()
        emp2.setName("emp2")
        emp2.setDesignation("developer")
        emp2.setEmpId("2")
        emp2.setSalary(3000.0)
        tempEmployees.add(emp1)
        tempEmployees.add(emp2)
        return tempEmployees
    }
}
