package nom.brunokarpo.microservices.docker.lab4.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class WordController {

    @Value("\${words}")
    private lateinit var words: Array<String>

    @GetMapping
    fun getWord(): ResponseEntity<String> {
        var word = words.get(Random().nextInt(words.size))
        return ResponseEntity.ok(word)
    }
}