package nom.brunokarpo.microservices.docker.lab4sentence.service.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.*
import nom.brunokarpo.microservices.docker.lab4sentence.service.WordService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class WordServiceImpl @Autowired constructor(
        private val subjectClient: SubjectClient,
        private val verbClient: VerbClient,
        private val articleClient: ArticleClient,
        private val adjectiveClient: AdjectiveClient,
        private val nounClient: NounClient
): WordService {

    override fun getSubject(): String {
        return subjectClient.getWord().word
    }

    override fun getVerb(): String {
        return verbClient.getWord().word
    }

    override fun getArticle(): String {
        return articleClient.getWord().word
    }

    override fun getAdjective(): String {
        return adjectiveClient.getWord().word
    }

    override fun getNoun(): String {
        return nounClient.getWord().word
    }
}