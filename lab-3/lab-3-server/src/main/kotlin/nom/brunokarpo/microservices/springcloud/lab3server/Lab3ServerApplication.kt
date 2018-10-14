package nom.brunokarpo.microservices.springcloud.lab3server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class Lab3ServerApplication

fun main(args: Array<String>) {
    runApplication<Lab3ServerApplication>(*args)
}
