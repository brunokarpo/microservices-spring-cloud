package nom.brunokarpo.microservices.docker.lab4sentence.controller

import nom.brunokarpo.microservices.docker.lab4sentence.service.SentenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

@RestController
class SentenceController {

    @Autowired
    private lateinit var sentenceService: SentenceService

    @GetMapping("/sentence")
    fun getSentence(): ResponseEntity<String> {
        var sentence: String = "SOME SENTENCES<br/><br/>" +
                "${sentenceService.buildSentence()}<br/>" +
                "${sentenceService.buildSentence()}<br/>" +
                "${sentenceService.buildSentence()}<br/>" +
                "${sentenceService.buildSentence()}<br/>" +
                "${sentenceService.buildSentence()}<br/>"
        return ResponseEntity.ok(sentence)
    }

}