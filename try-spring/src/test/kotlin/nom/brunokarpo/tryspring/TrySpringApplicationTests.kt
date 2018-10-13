package nom.brunokarpo.tryspring

import io.restassured.RestAssured
import org.hamcrest.CoreMatchers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class TrySpringApplicationTests {

    @LocalServerPort
    private var port: Int? = null

    @Before
    fun setUp() {
        RestAssured.port = port!!.toInt()
    }

    @Test
    fun shouldSayHelloWorld() {
        RestAssured.`when`()
                .get("say-hello")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body(CoreMatchers.equalTo("Hello World!"))
    }
}
