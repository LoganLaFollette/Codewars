package main.kotlin.co.kata.kyu6

import java.math.BigDecimal

object MaxBall {
    val GRAVITY: Double = 9.81

    fun maxBall(v0: Int): Int {
        var maxHeightTime = 0.0
        var maxHeight = 0.0
        var currentHeight = calculateHeight(v0.toDouble(), 1.0)
        var currentTime = 1.0

        while (currentHeight > 0.0) {
            currentHeight = calculateHeight(v0.toDouble(), currentTime)
            if (currentHeight > maxHeight) {
                maxHeight = currentHeight
                maxHeightTime = currentTime
            }
            currentTime++
        }
        return maxHeightTime.toInt()
    }

    private fun calculateHeight(velocity: Double, time: Double): Double {
        val timeInSec = time / 10.0
        val effectOfGravity = .5 * GRAVITY * timeInSec * timeInSec
        return (velocity / 60.00 / 60.0 * 1000).times(timeInSec).minus(effectOfGravity)
    }
}