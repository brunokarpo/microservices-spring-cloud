package nom.brunokarpo.microservices.springcloud.lab1.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

    @GetMapping("/")
    fun sayHello(): String {
        return "hello"
    }
}