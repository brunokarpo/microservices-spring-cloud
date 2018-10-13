package nom.brunokarpo.microservices.springcloud.lab1

import nom.brunokarpo.microservices.springcloud.lab1.model.Team
import nom.brunokarpo.microservices.springcloud.lab1.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class Lab1Application {

    @Autowired
    private var teamRepository: TeamRepository? = null

    @PostConstruct
    fun initDatabase() {
        teamRepository!!.saveAll(
                listOf(
                        Team("Harlem", "Globetrotters"),
                        Team("Washington", "Generals")
                )
        )
    }
}

fun main(args: Array<String>) {
    runApplication<Lab1Application>(*args)
}
