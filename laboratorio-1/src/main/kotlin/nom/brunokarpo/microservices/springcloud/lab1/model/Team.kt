package nom.brunokarpo.microservices.springcloud.lab1.model

import javax.persistence.*

@Entity
@Table(name = "team")
data class Team(

        var name: String? = null,
        var location: String? = null,
        var mascot: String? = null,

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null)