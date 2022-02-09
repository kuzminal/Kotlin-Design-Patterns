import Parser.Companion.property
import org.junit.jupiter.api.Test
import kotlin.test.assertContains
import kotlin.test.assertEquals

class AbstractFactoryTest {
    @Test
    fun createIntPropertyAndCheckType() {
        val portProperty = property("port: 8080")
        assertEquals(portProperty::class.java, IntProperty::class.java)
    }

    @Test
    fun createStringPropertyAndCheckType() {
        val environment = property("environment: production")
        assertEquals(environment::class.java, StringProperty::class.java)
    }

    @Test
    fun createServerAndCheckProperties() {
        val server = Parser.server(listOf("port: 8080", "environment: production"))
        val portProperty = property("port: 8080")
        val environment = property("environment: production")
        assertContains(server.properties, portProperty)
        assertContains(server.properties, environment)
    }
}