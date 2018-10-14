package nom.brunokarpo.microservices.springcloud.lab4.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class WordController {

    @Value("\${words}")
    private lateinit var words: String

    @GetMapping("/")
    fun getWord(): String {
        var wordArray: List<String> = words.split(",")
        var i: Int = Random().nextInt(wordArray.size)
        return wordArray[i]
    }

}