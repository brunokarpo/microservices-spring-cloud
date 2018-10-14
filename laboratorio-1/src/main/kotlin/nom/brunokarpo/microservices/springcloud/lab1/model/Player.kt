package nom.brunokarpo.microservices.springcloud.lab1.model

import javax.persistence.*

@Entity
@Table(name = "player")
data class Player(
        var name: String? = null,
        var position: String? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null
)