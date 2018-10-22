package nom.brunokarpo.microservices.docker.lab4sentence.service.impl

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand
import nom.brunokarpo.microservices.docker.lab4sentence.dao.*
import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word
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

    @HystrixCommand(fallbackMethod = "getFallbackSubject")
    override fun getSubject(): Word {
        return subjectClient.getWord()
    }

    override fun getVerb(): Word {
        return verbClient.getWord()
    }

    override fun getArticle(): Word {
        return articleClient.getWord()
    }

    @HystrixCommand(fallbackMethod = "getFallbackAdjective")
    override fun getAdjective(): Word {
        return adjectiveClient.getWord()
    }

    @HystrixCommand(fallbackMethod = "getFallbackNoun")
    override fun getNoun(): Word {
        return nounClient.getWord()
    }

    private fun getFallbackSubject(): Word {
        return Word("Someone")
    }

    private fun getFallbackAdjective(): Word {
        return Word("")
    }

    private fun getFallbackNoun(): Word {
        return Word("something")
    }
}