package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.*
import com.example.pruebadegradleparatesis.Repository.*
import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.hibernate.SessionFactory
import org.hibernate.Transaction
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.stereotype.Service
import org.springframework.util.MimeTypeUtils
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.persistence.Id
import javax.validation.Valid

@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/categories")
class CustomerController {
  @Autowired
    lateinit var pers: CustomerRepository
    @Autowired
    lateinit var emplo: EmployeeRepository
   //Anotacion del servicio que se utilizara.
    @Autowired
    lateinit var categories:CategoriaRepository

    @GetMapping
fun listar():List<Categorias>{
    return categories.findAll()
}
    @PostMapping
    fun agregar( @RequestBody c: Categorias): Categorias
    {
        return categories.save(c)
    }

    @GetMapping( path = ["/{id}"])
    fun Actualizarcategoria(@RequestBody @PathVariable("id") id:Int): Categorias{
        return categories.getOne(id.toInt().toLong())
    }

    @PutMapping(path = ["/{id}"])
    fun editar( @PathVariable id:Long, @RequestBody p:Categorias):Categorias{
       p.caid = id.toInt()
        return categories.saveAndFlush(p)
    }

    @DeleteMapping( path = ["/id"])
fun DeleteCategorie(id: Long): Categorias {
        val p: Categorias = categories.getOne(id)
        categories.delete(p)
        return p
    }


   /* @RequestMapping("contrato")

    fun savecustomer():String{

    //Empiesa el guardado para los datos del reporte.
   val reportehorasextras = Report("a21",
            "10-10-1989",
            "falla en algo",
            1,
            30)

    val reportehorasextras2 = Report("b22", "10-10-1989",
            "funcionamiento erroneo",
            2,
            25)

//Guardando los datos del contrato
    repohours.saveAll(setOf(reportehorasextras,reportehorasextras2))

        //Datos del contrato
        val mining = Contract("co1"
                ,"telecomuniacoines"
                ,"Tica","Codelco"
                , true,reportehorasextras)
        val computing =  Contract("co2",
                "reparaciones",
                "Nose",
                "Cierra Gorda",
                true,reportehorasextras)
        contr.saveAll(setOf(computing, mining))
    return "Los datos fueron guardados"

    }

    @RequestMapping("deleteall")
    fun borrartodo():String{
        try {
            contr.deleteAll()
            repohours.deleteAll()
            emplo.deleteAll()
            return "Se elimino con exito"
        }catch (e:Exception)
        {
            return "No se pudo eliminar. "+ e.message
        }
    }


    //Save nuevo user.
    @RequestMapping("saveuser", method = [RequestMethod.POST],
            produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
            headers = ["Accept=application/json"])
    @ResponseBody
    fun saveuser(@Valid @RequestBody person:Person = Person() ,employee: Employee = Employee(), contract: Contract) {

        val datos:Person = Person(person.firstName,person.lastName,person.Rut,person.Phone,person.Emai,employee,contract)
        try {
            pers.save(datos)
        }catch (e:Exception){
            if(transaction !=null){
                transaction?.rollback()

            }
        }
        finally {
            session?.close()

        }

    }

    //Guardar los empleos que pueden tener las personas en la empresa.
    @RequestMapping("savemployee",method = [RequestMethod.POST],
            produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
            headers = ["Accept=application/json"])
    @ResponseBody
     fun savemployee(@Valid @RequestBody employee: Employee) {
        try {
            emplo.save(employee)
        }catch (e:Exception){

            if(transaction != null){ transaction?.rollback()
            }

        }
        finally {
            session?.close()
        }

    }



    //Aqui se muestra los resultados mediante Json
    @RequestMapping("allreport",produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
            method = [RequestMethod.GET],headers=["Accept=application/json"])
    @ResponseBody

    fun Allreports():MutableList<Report>
    {

       return repohours.findAll()
    }

    @RequestMapping("allcontract",produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
            method = [RequestMethod.GET],headers=["Accept=application/json"])
    @ResponseBody
    fun Allcontrat():List<Contract> {

        return contr.findAll()
    }


    @RequestMapping("alluser",produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
                    method = [RequestMethod.GET],headers=["Accept=application/json"])
    @ResponseBody
    fun alluser():ResponseEntity<MutableList<Person>>  {
        try {
            return ResponseEntity<MutableList<Person>>(pers.findAll(),HttpStatus.OK)
        }catch (e:Exception){
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }

    }

    @RequestMapping("allemployee",produces = [MimeTypeUtils.APPLICATION_JSON_VALUE],
            method = [RequestMethod.GET],headers=["Accept=application/json"])
    @ResponseBody
    fun allemployee():ResponseEntity<List<Employee>>  {
        try {
            return ResponseEntity<List<Employee>>(emplo.findAll(),HttpStatus.OK)
        }catch (e:Exception){
            return ResponseEntity(HttpStatus.BAD_REQUEST)
        }

    }*/

}
