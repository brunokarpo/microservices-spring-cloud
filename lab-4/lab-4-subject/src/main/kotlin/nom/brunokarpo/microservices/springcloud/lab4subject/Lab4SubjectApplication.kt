package nom.brunokarpo.microservices.springcloud.lab4subject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@EnableDiscoveryClient
@SpringBootApplication
class Lab4SubjectApplication

fun main(args: Array<String>) {
    runApplication<Lab4SubjectApplication>(*args)
}
