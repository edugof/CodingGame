package basic

import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val lightX = input.nextInt() // the X position of the light of power
    val lightY = input.nextInt() // the Y position of the light of power
    var initialTX = input.nextInt() // Thor's starting X position
    var initialTY = input.nextInt() // Thor's starting Y position

    // game loop
    while (true) {
        val remainingTurns = input.nextInt() // The remaining amount of turns Thor can move. Do not remove this line.

        println(
                with(initialTY.compareTo(lightY)) {
                    initialTY -= this
                    when (this) { -1 -> "S"
                        1 -> "N"
                        else -> ""
                    }
                }
                        +
                        with(initialTX.compareTo(lightX)) {
                            initialTX -= this
                            when (this) { -1 -> "E"
                                1 -> "W"
                                else -> ""
                            }
                        }
        )
    }
}