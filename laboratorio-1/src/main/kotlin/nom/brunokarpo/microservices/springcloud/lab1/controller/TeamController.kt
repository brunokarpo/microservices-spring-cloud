package nom.brunokarpo.microservices.springcloud.lab1.controller

import nom.brunokarpo.microservices.springcloud.lab1.model.Team
import nom.brunokarpo.microservices.springcloud.lab1.repository.TeamRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class TeamController {

    @Autowired
    private lateinit var teamRepository: TeamRepository

    @GetMapping("/teams")
    fun getTeams(): ResponseEntity<Iterable<Team>> {
        return ResponseEntity.ok( teamRepository.findAll() )
    }

    @GetMapping("/teams/{id}")
    fun getTeam(@PathVariable("id") id: Long): ResponseEntity<Team> {
        if (!teamRepository.findById(id).isPresent()) {
            return ResponseEntity.notFound().build()
        }
        return ResponseEntity.ok(teamRepository.findById(id).get())
    }
}