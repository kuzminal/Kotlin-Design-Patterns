import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class BuilderTest {
    @Test
    fun buildEmail() {
        val email = MailBuilder()
            .to(listOf("hello@mail.com"))
            .message("Hello")
            .title("Title")
            .important(true)
            .build()
        assertNotEquals(email.to, listOf())
        assertNotEquals(email.message, "")
        assertNotEquals(email.title, "")
        assertEquals(email.important, true)
    }
}