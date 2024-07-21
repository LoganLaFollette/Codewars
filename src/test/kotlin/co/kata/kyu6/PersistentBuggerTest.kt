package co.kata.kyu6

import main.kotlin.co.kata.kyu6.PersistentBugger.persistence
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class PersistentBuggerTest {
    @Test
    fun `Basic Tests`() {
        assertEquals(3, persistence(39))
        assertEquals(0, persistence(4))
        assertEquals(2, persistence(25))
        assertEquals(4, persistence(999))
    }
}