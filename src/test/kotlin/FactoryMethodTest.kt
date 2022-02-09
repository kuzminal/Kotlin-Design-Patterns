import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class FactoryMethodTest {
    @Test
    fun createQueen() {
        val queen = createPiece("qc3")
        assertEquals(queen, Queen('c', '3'))
    }

    @Test
    fun createPawn() {
        val pawn = createPiece("pa8")
        assertEquals(pawn, Pawn('a', '8'))
    }

    @Test
    fun createUnexpected() {
        assertFailsWith<RuntimeException>(
            message = "No exception found",
            block = {
                createPiece("aaa")
            }
        )
    }
}