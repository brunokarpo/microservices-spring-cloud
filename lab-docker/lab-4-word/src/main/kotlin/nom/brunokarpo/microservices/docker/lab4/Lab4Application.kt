package nom.brunokarpo.microservices.docker.lab4

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Lab4Application

fun main(args: Array<String>) {
    runApplication<Lab4Application>(*args)
}
