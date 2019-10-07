package com.example.pruebadegradleparatesis.ServiceImplement

import com.example.pruebadegradleparatesis.Model.Categories
import com.example.pruebadegradleparatesis.Repository.CategoriesRepository
import com.example.pruebadegradleparatesis.Service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoriesImp : CategoryService {
    @Autowired
    lateinit var repositorio: CategoriesRepository

    override fun listar(): List<Categories> {
        return repositorio.findAll()
    }

    override fun listarId(id: Long): Categories {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun add(c: Categories): Categories {
    return repositorio.save(c)
    }

    override fun edit(c: Categories): Categories {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun delete(id: Long): Categories {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
