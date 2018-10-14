package nom.brunokarpo.microservices.springcloud.lab3client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Lab3ClientApplication

fun main(args: Array<String>) {
    runApplication<Lab3ClientApplication>(*args)
}
