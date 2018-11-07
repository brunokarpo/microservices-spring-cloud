package nom.brunokarpo.microservices.docker.lab4configserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Lab4ConfigServerApplication

fun main(args: Array<String>) {
    runApplication<Lab4ConfigServerApplication>(*args)
}
