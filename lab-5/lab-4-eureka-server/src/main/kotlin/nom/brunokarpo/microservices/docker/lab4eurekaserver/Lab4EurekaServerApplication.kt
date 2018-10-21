package nom.brunokarpo.microservices.docker.lab4eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class Lab4EurekaServerApplication

fun main(args: Array<String>) {
    runApplication<Lab4EurekaServerApplication>(*args)
}
