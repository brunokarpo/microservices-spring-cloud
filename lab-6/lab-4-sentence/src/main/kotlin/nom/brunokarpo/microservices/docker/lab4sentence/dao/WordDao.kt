package nom.brunokarpo.microservices.docker.lab4sentence.dao

import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word

interface WordDao {

    fun getWord(): Word

    companion object {
        val SUBJECT: String = "LAB-4-SUBJECT"
        val VERB: String = "LAB-4-VERB"
        val ARTICLE: String = "LAB-4-ARTICLE"
        val ADJECTIVE: String = "LAB-4-ADJECTIVE"
        val NOUN: String = "LAB-4-NOUN"
    }

}