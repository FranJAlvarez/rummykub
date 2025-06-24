import com.project.Tile
import com.project.TileColor
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue




class TileTest {
    @Test
    fun `tile should have a number and a color`() {
        val tile = Tile(number = 8, color = TileColor.RED)
        assertEquals(8, tile.number)
        assertEquals(TileColor.RED, tile.color)
    }

    @Test
    fun `tile number should be between 1 and 13`() {

        assertThrows<IllegalArgumentException> { Tile(number = 0, color = TileColor.RED) }
        assertThrows<IllegalArgumentException> { Tile(number = 14, color = TileColor.RED) }
    }

    @Test
    fun `tiles with same number and color should be equal`() {
        val tile1 = Tile(number = 8, color = TileColor.RED)
        val tile2 = Tile(number = 8, color = TileColor.RED)
        val tile3 = Tile(number = 8, color = TileColor.BLUE)
        
        assertTrue(tile1 == tile2)
        assertFalse(tile1 == tile3)
    }
}


