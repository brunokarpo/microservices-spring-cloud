package nom.brunokarpo.microservices.docker.lab4sentence.dao.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.WordDao
import org.springframework.stereotype.Component

@Component("adjectiveService")
class AdjectiveDaoImpl: WordDaoImpl() {

    override fun getPartOfSpeech(): String {
        return WordDao.ADJECTIVE
    }
}