package nom.brunokarpo.microservices.springcloud.lab1.repository

import nom.brunokarpo.microservices.springcloud.lab1.model.Player
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RestResource
import org.springframework.stereotype.Repository

@Repository
@RestResource(path = "players", rel = "player")
interface PlayerRepository: CrudRepository<Player, Long> {
}