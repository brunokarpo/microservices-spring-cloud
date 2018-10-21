package nom.brunokarpo.microservices.docker.lab4.service

import nom.brunokarpo.microservices.docker.lab4.model.Word

interface WordService {

    fun getWord(): Word
}