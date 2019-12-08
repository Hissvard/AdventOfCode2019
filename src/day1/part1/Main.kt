package day1.part1

import java.io.File
import kotlin.math.floor

fun main() {
    val input = System.getProperty("user.dir") + "/src/day1/shared/input.txt"

    File(input).useLines { lines ->
        println(
            lines
                .map { it.toDouble() }
                .map { massFuel(it) }
                .reduce{ a, b -> a + b }
        )
    }
}

fun massFuel(mass: Double): Double = floor(mass / 3) - 2