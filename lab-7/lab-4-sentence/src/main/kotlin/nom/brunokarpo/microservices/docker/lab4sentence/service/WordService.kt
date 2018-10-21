package nom.brunokarpo.microservices.docker.lab4sentence.service

interface WordService {

    fun getSubject(): String
    fun getVerb(): String
    fun getArticle(): String
    fun getAdjective(): String
    fun getNoun(): String
}