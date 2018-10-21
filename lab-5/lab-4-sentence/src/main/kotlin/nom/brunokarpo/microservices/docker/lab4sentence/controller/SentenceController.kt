package nom.brunokarpo.microservices.docker.lab4sentence.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
class SentenceController {

    @Autowired
    private lateinit var restTemplate: RestTemplate

    @GetMapping("/sentence")
    fun getSentence(): ResponseEntity<String> {
        var sentence = "${getWord("LAB-4-SUBJECT")} " +
                "${getWord("LAB-4-VERB")} " +
                "${getWord("LAB-4-ARTICLE")} " +
                "${getWord("LAB-4-ADJECTIVE")} " +
                "${getWord("LAB-4-NOUN")}."

        return ResponseEntity.ok(sentence)
    }

    private fun getWord(service: String): String {
        return restTemplate.getForObject("http://${service}", String::class.java) ?: ""
    }
}