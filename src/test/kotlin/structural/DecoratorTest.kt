package structural

import org.junit.jupiter.api.Test
import kotlin.test.assertFailsWith

class DecoratorTest {
    @Test
    fun decor() {
        val starTrekRepository = DefaultStarTrekRepository()
        val withValidating = ValidatingAdd(starTrekRepository)
        val withLoggingAndValidating = LoggingGetCaptain(withValidating)
         assertFailsWith<IllegalArgumentException>(
            message = "No exception found",
            block = {
                withLoggingAndValidating.addCaptain("USS Voyager",
                    "Kathryn Janeway")
            }
        )
    }
}