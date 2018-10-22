package nom.brunokarpo.microservices.docker.lab4sentence.service

import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word

interface WordService {

    fun getSubject(): Word
    fun getVerb(): Word
    fun getArticle(): Word
    fun getAdjective(): Word
    fun getNoun(): Word
}