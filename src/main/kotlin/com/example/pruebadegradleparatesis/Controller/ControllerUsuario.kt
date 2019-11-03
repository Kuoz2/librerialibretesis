package com.example.pruebadegradleparatesis.Controller

import com.example.pruebadegradleparatesis.Model.Rol
import com.example.pruebadegradleparatesis.Model.Usuario
import com.example.pruebadegradleparatesis.Repository.RolRepository
import com.example.pruebadegradleparatesis.Repository.UsuarioRepository
import org.springframework.beans.factory.annotation.Autowired

import org.springframework.web.bind.annotation.*
import java.security.Principal
import org.springframework.web.bind.annotation.RequestMapping




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

    @RequestMapping("/user")
    fun user(user: Principal): Principal {
        return user
    }



       @GetMapping
       fun tomarusuario(): MutableList<Usuario> {
           return usuario.findAll()
       }

       @RequestMapping("/saveuser")
       fun guardarusuario():Usuario{

           val gusuario = Usuario("17246370-3"
                   ,"david"
                   ,"palta"
                   ,"anes"
                   ,73804093
                   ,"david.palta,anes1989@gmail.com"
                   ,"chilena"
                   ,"villa los volcanes", listOf(Rol("admin")))

           return usuario.save(gusuario)
       }


}
