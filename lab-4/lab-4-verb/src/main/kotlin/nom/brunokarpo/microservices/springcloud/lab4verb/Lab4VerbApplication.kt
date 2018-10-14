package nom.brunokarpo.microservices.springcloud.lab4verb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class Lab4VerbApplication

fun main(args: Array<String>) {
    runApplication<Lab4VerbApplication>(*args)
}
