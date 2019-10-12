package com.example.pruebadegradleparatesis.ConfigurationConnectorPerson

import org.apache.catalina.Context
import org.apache.catalina.connector.Connector
import org.apache.tomcat.util.descriptor.web.SecurityCollection
import org.apache.tomcat.util.descriptor.web.SecurityConstraint
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory
import org.springframework.boot.web.servlet.server.ServletWebServerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper


@Configuration
class ConnectorWebHttos {
    /*
       @Bean
       fun objectMapper(): ObjectMapper {
           return ObjectMapper()
                   .enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
                   .enable(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)
       }
      @Bean
       fun servletContainer(): TomcatServletWebServerFactory {
           val tomcat = object : TomcatServletWebServerFactory() {
                override fun postProcessContext(context: Context) {
                   val securityConstraint = SecurityConstraint()
                   securityConstraint.setUserConstraint("CONFIDENTIAL")
                   val collection = SecurityCollection()
                   collection.addPattern("/*")
                   securityConstraint.addCollection(collection)
                   context.addConstraint(securityConstraint)
               }
           }
           tomcat.addAdditionalTomcatConnectors(redirectConnector())
           return tomcat
       }

       private fun redirectConnector(): Connector {
           val connector = Connector("org.apache.coyote.http11.Http11NioProtocol")
           connector.setScheme("http")
           connector.setPort(8080)
           connector.setSecure(false)
           connector.setRedirectPort(8443)
           return connector
       }*/

      */
}
