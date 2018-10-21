package nom.brunokarpo.microservices.docker.lab4.service.impl

import nom.brunokarpo.microservices.docker.lab4.service.WordService
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.util.*

@Service
class WordServiceImpl(
        @Value("\${words}")
        private var words: Array<String>
    ): WordService {

    override fun getWord(): String {
        return words.get(Random().nextInt(words.size))
    }
}