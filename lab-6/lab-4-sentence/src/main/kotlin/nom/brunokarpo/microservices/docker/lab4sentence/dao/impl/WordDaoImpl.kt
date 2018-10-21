package nom.brunokarpo.microservices.docker.lab4sentence.dao.impl

import nom.brunokarpo.microservices.docker.lab4sentence.dao.WordDao
import nom.brunokarpo.microservices.docker.lab4sentence.domain.Word
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.ServiceInstance
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient
import org.springframework.web.client.RestTemplate

abstract class WordDaoImpl: WordDao {

    @Autowired
    private lateinit var loadBalancer: LoadBalancerClient

    abstract fun getPartOfSpeech(): String

    override fun getWord(): Word {
        var serviceInstance: ServiceInstance = loadBalancer.choose(getPartOfSpeech())
        return (RestTemplate()).getForObject(serviceInstance.uri, Word::class.java) ?: Word()
    }
}