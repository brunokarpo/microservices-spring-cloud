package nom.brunokarpo.microservices.docker.lab4sentence

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class Lab4SentenceApplication

fun main(args: Array<String>) {
    runApplication<Lab4SentenceApplication>(*args)
}
