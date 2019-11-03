package com.example.pruebadegradleparatesis.Model

class Employee {
    private var empId: String? = null
    private var name: String? = null
    private var designation: String? = null
    private var salary: Double = 0.toDouble()

    fun Employee() {}

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getDesignation(): String? {
        return designation
    }

    fun setDesignation(designation: String) {
        this.designation = designation
    }

    fun getSalary(): Double {
        return salary
    }

    fun setSalary(salary: Double) {
        this.salary = salary
    }

    fun getEmpId(): String? {
        return empId
    }

    fun setEmpId(empId: String) {
        this.empId = empId
    }

    override fun hashCode(): Int {
        val prime = 31
        var result = 1
        result = prime * result + if (designation == null) 0 else designation!!.hashCode()
        result = prime * result + if (empId == null) 0 else empId!!.hashCode()
        result = prime * result + if (name == null) 0 else name!!.hashCode()
        val temp: Long
        temp = java.lang.Double.doubleToLongBits(salary)
        result = prime * result + (temp xor temp.ushr(32)).toInt()
        return result
    }

    override fun equals(obj: Any?): Boolean {
        if (this === obj)
            return true
        if (obj == null)
            return false
        if (javaClass != obj.javaClass)
            return false
        val other = obj as Employee?
        if (designation == null) {
            if (other!!.designation != null)
                return false
        } else if (designation != other!!.designation)
            return false
        if (empId == null) {
            if (other.empId != null)
                return false
        } else if (empId != other.empId)
            return false
        if (name == null) {
            if (other.name != null)
                return false
        } else if (name != other.name)
            return false
        return if (java.lang.Double.doubleToLongBits(salary) != java.lang.Double.doubleToLongBits(other.salary)) false else true
    }
}
