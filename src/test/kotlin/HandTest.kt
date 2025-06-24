import com.project.Tile
import com.project.TileColor
import com.project.Hand
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class HandTest {
    @Test
    fun testAddAndRemoveTile() {
        val hand = Hand()
        val tile = Tile(5, TileColor.RED)
        hand.addTile(tile)
        assertTrue(tile in hand.tiles)
        hand.removeTile(tile)
        assertTrue(tile !in hand.tiles)
    }

    @Test
    fun testHandIsEmptyInitially() {
        val hand = Hand()
        assertTrue(hand.tiles.isEmpty())
    }
}