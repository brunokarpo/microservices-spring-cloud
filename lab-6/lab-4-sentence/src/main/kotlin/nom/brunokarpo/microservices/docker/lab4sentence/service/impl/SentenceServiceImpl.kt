package nom.brunokarpo.microservices.docker.lab4sentence.service.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.*
import nom.brunokarpo.microservices.docker.lab4sentence.service.SentenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SentenceServiceImpl @Autowired constructor(
        private val verbService: VerbClient,
        private val subjectService: SubjectClient,
        private val articleService: ArticleClient,
        private val adjectiveService: AdjectiveClient,
        private val nounService: NounClient
): SentenceService {

    override fun buildSentence(): String {
        return "${subjectService.getWord().word} " +
                "${verbService.getWord().word} " +
                "${articleService.getWord().word} " +
                "${adjectiveService.getWord().word} " +
                "${nounService.getWord().word}."
    }
}