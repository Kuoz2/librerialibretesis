package com.example.pruebadegradleparatesis.ConfigurationConnectorPerson
import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration
import org.springframework.context.annotation.Configuration

import org.springframework.context.annotation.PropertySource

@Configuration
//@EnableWebSecurity

class ConnectorWebHttos: WebSecurityEnablerConfiguration() {


/*
    @Override
    @Throws
    fun configuracion(http: HttpSecurity){

         http
                .authorizeRequests()
                .antMatchers("/","/index","/voucher").permitAll()
                .antMatchers("/admin*").access("hasRole('ADMIN')")
                .antMatchers("/user*").access("hasRole('USER') or hasRole('ADMIN')")
                .anyRequest().authenticated()

    }

    //Registra el service para usuarios y el encriptador de contrasena


    lateinit var datasource: javax.sql.DataSource

    @Autowired
    @Throws(Exception::class)
    fun configureGlobal(auth: AuthenticationManagerBuilder) {

        // Setting Service to find User in the database.
        // And Setting PassswordEncoder
        //auth.userDetailsService<UserDetailsService>(userDetailsService).passwordEncoder(passwordEncoder())
        auth.jdbcAuthentication()
                .dataSource(datasource)
                .usersByUsernameQuery("")
                .authoritiesByUsernameQuery("")
    }
*/

}
