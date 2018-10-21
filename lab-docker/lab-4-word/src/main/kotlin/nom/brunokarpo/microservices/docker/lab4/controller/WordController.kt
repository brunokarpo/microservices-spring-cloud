package nom.brunokarpo.microservices.docker.lab4.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WordController {

    @Value("\${words}")
    private lateinit var words: String

    @GetMapping
    fun getWord(): ResponseEntity<String> {
        var wordsArray: List<String> = words.split(",")
        var i: Int = Math.round(Math.random() * (wordsArray.size - 1) ).toInt()
        return ResponseEntity.ok(wordsArray.get(i))
    }
}