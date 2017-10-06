package basic

import java.util.*

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    // game loop
    while (true) {

        val mountains: MutableList<Int> = mutableListOf()

        for (i in 0 until 8) {
            mountains.add(input.nextInt())
        }

        println(mountains.withIndex().maxBy { it.value }?.index) // The index of the mountain to fire on.
    }
}