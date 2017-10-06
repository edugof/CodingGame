package basic

import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val n = input.nextInt() // the number of temperatures to analyse
    var closestTemperatureToZero = 5526

    for (i in 0 until n) {
        val t = input.nextInt() // a temperature expressed as an integer ranging from -273 to 5526

        if ((Math.abs(t) < Math.abs(closestTemperatureToZero)) || (Math.abs(t) == Math.abs(closestTemperatureToZero) && t > closestTemperatureToZero)) {
            closestTemperatureToZero = t
        }

    }

    if (n == 0) {
        closestTemperatureToZero = 0
    }

    println(closestTemperatureToZero)
}