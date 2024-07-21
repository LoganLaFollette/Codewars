package co.kata

import main.kotlin.co.kata.MultiplicationTable
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class MultiplicationTableTest {

    private fun Array<IntArray>.stringify(): String = "[\n" + Array(this.size,
        { "  [ " + this[it].map { n -> n.toString() }.joinToString(", ") + " ]" }).joinToString("\n") + "\n]"

    @Test
    fun `Basic Test`() {
        val size = 3
        val user = MultiplicationTable.KataSolution.multiplicationTable(size)

        val sol = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(2, 4, 6),
            intArrayOf(3, 6, 9)
        )

        assertTrue(user.contentDeepEquals(sol), "Expected:\n${sol.stringify()}\nGot:\n${user.stringify()}")
    }

    @Test
    fun `1`() {
        val size = 1
        val user = MultiplicationTable.KataSolution.multiplicationTable(size)

        val sol = arrayOf(
            intArrayOf(1),
        )

        assertTrue(user.contentDeepEquals(sol), "Expected:\n${sol.stringify()}\nGot:\n${user.stringify()}")
    }
}