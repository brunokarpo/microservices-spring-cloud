package nom.brunokarpo.microservices.springcloud.lab1.controller

import nom.brunokarpo.microservices.springcloud.lab1.model.Team
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController {

    @GetMapping("/teams")
    fun getTeams(): List<Team> {
        var team: Team = Team(1L, "Harlem", "Globetrotters", null)
        var team2: Team =  Team(2L, "Washington", "Generals", null)

        return listOf(team, team2)
    }
}