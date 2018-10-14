package nom.brunokarpo.microservices.springcloud.lab4verb

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class VerbController {

    @Value("\${words}")
    private lateinit var words: String

    @GetMapping("/")
    fun getWord(): String {
        var wordArray = words.split(",")
        var i: Int = Math.round(Math.random() * (wordArray.size - 1)).toInt()
        return wordArray[i]
    }

}