package nom.brunokarpo.microservices.springcloud.lab1.repository

import nom.brunokarpo.microservices.springcloud.lab1.model.Team
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface TeamRepository: CrudRepository<Team, Long>