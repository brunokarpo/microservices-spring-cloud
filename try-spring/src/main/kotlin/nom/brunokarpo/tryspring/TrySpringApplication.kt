package nom.brunokarpo.tryspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TrySpringApplication

fun main(args: Array<String>) {
    runApplication<TrySpringApplication>(*args)
}
