package co.kata.kyu6

import main.kotlin.co.kata.kyu6.MaxBall.maxBall
import org.junit.jupiter.api.Assertions.assertEquals
import kotlin.test.Test

class MaxBallTest {
    private fun testing(actual:Int, expected:Int) {
        assertEquals(expected.toLong(), actual.toLong())
    }

    @Test
    fun test() {
        println("Fixed Tests maxBall")
        testing(maxBall(37), 10)
        testing(maxBall(45), 13)

    }
}