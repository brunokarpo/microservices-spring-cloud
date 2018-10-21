package nom.brunokarpo.microservices.docker.lab4.controller

import nom.brunokarpo.microservices.docker.lab4.model.Word
import nom.brunokarpo.microservices.docker.lab4.service.WordService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class WordController @Autowired constructor(
        private val wordService: WordService) {

    @GetMapping
    fun getWord(): ResponseEntity<Word> {
        var word = wordService.getWord()
        return ResponseEntity.ok(word)
    }
}