package creational

import Logger
import NoMoviesList
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
        assertEquals(Logger.file, Logger.file)
        assertEquals(logger, anotherOneLogger)
    }
}