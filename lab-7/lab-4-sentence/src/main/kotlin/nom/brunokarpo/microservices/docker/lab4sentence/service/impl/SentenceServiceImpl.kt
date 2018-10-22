package nom.brunokarpo.microservices.docker.lab4sentence.service.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.*
import nom.brunokarpo.microservices.docker.lab4sentence.service.SentenceService
import nom.brunokarpo.microservices.docker.lab4sentence.service.WordService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SentenceServiceImpl @Autowired constructor(
        private val wordService: WordService
): SentenceService {

    override fun buildSentence(): String {
        return "${wordService.getSubject().word} " +
                "${wordService.getVerb().word} " +
                "${wordService.getArticle().word} " +
                "${wordService.getAdjective().word} " +
                "${wordService.getNoun().word}."
    }
}