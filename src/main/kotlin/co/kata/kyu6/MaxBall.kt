package main.kotlin.co.kata.kyu6

/**
 * You throw a ball vertically upwards with an initial speed v (in km per hour). The height h of the ball at each time t is given by h = v*t - 0.5*g*t*t where g is Earth's gravity (g ~ 9.81 m/s**2). A device is recording at every tenth of second the height of the ball. For example with v = 15 km/h the device gets something of the following form: (0, 0.0), (1, 0.367...), (2, 0.637...), (3, 0.808...), (4, 0.881..) ... where the first number is the time in tenth of second and the second number the height in meter.
 *
 * Task
 * Write a function max_ball with parameter v (in km per hour) that returns the time in tenth of second of the maximum height recorded by the device.
 *
 * Examples:
 * max_ball(15) should return 4
 *
 * max_ball(25) should return 7
 *
 * Notes
 * Remember to convert the velocity from km/h to m/s or from m/s in km/h when necessary.
 * The maximum height recorded by the device is not necessarily the maximum height reached by the ball.
 */
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