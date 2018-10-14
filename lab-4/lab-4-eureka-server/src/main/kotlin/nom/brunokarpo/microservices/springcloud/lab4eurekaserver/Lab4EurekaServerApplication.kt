package nom.brunokarpo.microservices.springcloud.lab4eurekaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class Lab4EurekaServerApplication

fun main(args: Array<String>) {
    runApplication<Lab4EurekaServerApplication>(*args)
}
