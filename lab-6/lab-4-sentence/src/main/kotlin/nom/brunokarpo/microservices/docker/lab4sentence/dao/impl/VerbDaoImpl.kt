package nom.brunokarpo.microservices.docker.lab4sentence.dao.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.WordDao
import org.springframework.stereotype.Component

@Component("verbService")
class VerbDaoImpl: WordDaoImpl() {
    override fun getPartOfSpeech(): String {
        return WordDao.VERB
    }
}