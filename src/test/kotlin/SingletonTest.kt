import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SingletonTest {
    @Test
    fun equalsInstance() {
        val noMovie = NoMoviesList
        val myNoMovie = NoMoviesList
        assertEquals(noMovie, myNoMovie)
    }

    @Test
    fun loggerFileName() {
        val logger = Logger
        val anotherOneLogger = Logger
        assertEquals(logger.file, anotherOneLogger.file)
        assertEquals(logger, anotherOneLogger)
    }
}