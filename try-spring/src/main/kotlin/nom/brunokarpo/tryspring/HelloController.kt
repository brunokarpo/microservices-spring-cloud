package nom.brunokarpo.tryspring

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("say-hello")
    fun helloWorld(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World!")
    }
}