import com.project.TileBag
import org.junit.jupiter.api.Test

import kotlin.test.assertEquals
import kotlin.test.assertIsNot
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class TileBagTest {
    @Test
    fun testDrawReducesSize() {
        val bag = TileBag()
        val initialSize = bag.size()
        val tile = bag.draw()
        assertNotNull(tile)
        assertEquals(initialSize - 1, bag.size())
    }

    @Test
    fun testBagIsEmptyAfterAllDrawn() {
        val bag = TileBag()
        repeat(bag.size()) { bag.draw() }
        assertTrue(bag.isEmpty())
    }
}