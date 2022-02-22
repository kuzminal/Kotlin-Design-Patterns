package creational

import Server
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StaticFactoryMethodTest {
    @Test
    fun createServer() {
        val server = Server.withPort(8080)
        assertEquals(server.port, 8080)
    }
}
