package nom.brunokarpo.microservices.springcloud.lab1.controller

import nom.brunokarpo.microservices.springcloud.lab1.model.Team
import nom.brunokarpo.microservices.springcloud.lab1.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController {

    @Autowired
    private lateinit var teamRepository: TeamRepository

    @GetMapping("/teams")
    fun getTeams(): Iterable<Team> {
        return teamRepository.findAll()
    }
}