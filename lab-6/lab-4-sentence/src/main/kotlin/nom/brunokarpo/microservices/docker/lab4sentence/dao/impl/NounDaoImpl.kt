package nom.brunokarpo.microservices.docker.lab4sentence.dao.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.WordDao
import org.springframework.stereotype.Component

@Component("nounService")
class NounDaoImpl: WordDaoImpl() {
    override fun getPartOfSpeech(): String {
        return WordDao.NOUN
    }
}