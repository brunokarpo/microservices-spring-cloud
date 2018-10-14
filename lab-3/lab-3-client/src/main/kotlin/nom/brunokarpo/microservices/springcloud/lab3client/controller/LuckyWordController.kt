package nom.brunokarpo.microservices.springcloud.lab3client.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class LuckyWordController {

    @Value("\${lucky-word}")
    private lateinit var luckyWord: String

    @GetMapping
    fun showLuckyWord(): String {
        return "The lucky word is: ${luckyWord}"
    }

}