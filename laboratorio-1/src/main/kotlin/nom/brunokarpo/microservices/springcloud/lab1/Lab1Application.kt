package nom.brunokarpo.microservices.springcloud.lab1

import nom.brunokarpo.microservices.springcloud.lab1.model.Player
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
        val playerTeam = setOf(
                Player("Big Easy", "Showman"),
                Player("Buckets", "Guard"),
                Player("Dizzy", "Guard")
        )

        val team = Team("Harlem", "Globetrotters")
        team.players = playerTeam

        val team1 = Team("Washington", "Generals")

        teamRepository!!.saveAll(
                listOf( team, team1)
        )
    }
}

fun main(args: Array<String>) {
    runApplication<Lab1Application>(*args)
}
