package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Rol
import com.example.pruebadegradleparatesis.Model.Usuario
import com.example.pruebadegradleparatesis.Repository.RolRepository
import com.example.pruebadegradleparatesis.Repository.UsuarioRepository
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

import org.springframework.web.bind.annotation.*
import java.security.Principal
import org.springframework.web.bind.annotation.RequestMapping
import java.lang.reflect.Method
import javax.validation.Valid


@CrossOrigin(origins = ["http://localhost:4200"],maxAge = 3600)
@RestController
@RequestMapping("/usuario")

class ControllerUsuario {

  @Autowired
    lateinit var usuario:UsuarioRepository
    @Autowired
    lateinit var roles:RolRepository
    /*
       @Override
       fun cargarusuariopornombre(username: String):UserDetails{

         val appuser: com.example.pruebadegradleparatesis.Model.Usuario =
                 usuario.findByUnombreIn(username).orElseThrow()

           for (authority in appuser.roluser) {
               // ROLE_USER, ROLE_ADMIN,..
               val grantedAuthority = SimpleGrantedAuthority(authority.rolnombre)
               grantList.add(grantedAuthority)
           }
           return user
       }


   */

       @GetMapping
       fun tomarusuario(): MutableList<Usuario> {
           return usuario.findAll()
       }

        @PostMapping
    fun guardarusuario(@RequestBody @Valid  s:Usuario ): Usuario {

          val datos = Usuario(s.urun,
                    s.unombre,
                    s.uapellidop,
                    s.uapellidom,
                    s.ufono,
                    s.ucorreo,
                    s.unacionalidad,
                    s.udireccion,
                    s.ucontrasenia,
                    ArrayList(s.rol))


            return usuario.save(s)
        }


    @RequestMapping(path = ["/{unrun}"], method = [RequestMethod.GET])
    fun listarultimo(@PathVariable("unrun") urun: Long): String {
            return usuario.getOne(urun).urun
    }

    @RequestMapping("eliminarusuario")
    fun borrartodo():String{
        try {
            usuario.deleteAll()
            return "Se elimino con exito"
        }catch (e:Exception)
        {
            return "No se pudo eliminar. "+ e.message
        }
    }

     @RequestMapping("/saveuser")
       fun guardarusuario():Usuario{

           val gusuario = Usuario("17246420-3"
                   ,"david"
                   ,"palta"
                   ,"anes"
                   ,73804093
                   ,"david.palta,anes1989@gmail.com"
                   ,"chilena"
                   ,"villa los volcanes","111",listOf (Rol("admin")))

           return usuario.save(gusuario)
       }


}
