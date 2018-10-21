package nom.brunokarpo.microservices.docker.lab4sentence.dao

import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word

interface WordDao {

    fun getWord(): Word

    companion object {
        val SUBJECT: String = "SUBJECT"
        val VERB: String = "VERB"
        val ARTICLE: String = "ARTICLE"
        val ADJECTIVE: String = "ADJECTIVE"
        val NOUN: String = "NOUN"
    }

}