package nom.brunokarpo.microservices.docker.lab4sentence.dao

import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(ConstantesDAO.VERB)
interface VerbClient {

    @GetMapping("/")
    fun getWord(): Word
}