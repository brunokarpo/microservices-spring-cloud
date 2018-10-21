package nom.brunokarpo.microservices.docker.lab4sentence.service.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.WordDao
import nom.brunokarpo.microservices.docker.lab4sentence.service.SentenceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SentenceServiceImpl @Autowired constructor(
        private val verbService: WordDao,
        private val subjectService: WordDao,
        private val articleService: WordDao,
        private val adjectiveService: WordDao,
        private val nounService: WordDao
): SentenceService {

    override fun buildSentence(): String {
        return "${getWordFromService(subjectService)} " +
                "${getWordFromService(verbService)} " +
                "${getWordFromService(articleService)} " +
                "${getWordFromService(adjectiveService)} " +
                "${getWordFromService(nounService)}."
    }

    private fun getWordFromService(service: WordDao): String {
        return service.getWord().word
    }
}