package day1.part2

import java.io.File

fun main() {
    val input = System.getProperty("user.dir") + "/src/day1/shared/input.txt"

    File(input).useLines { lines ->
        val neededFuel = lines
            .map { line -> totalFuelNeeded(line.toInt()) }
            .sumBy { it }

        println(neededFuel)
    }
}

fun totalFuelNeeded(mass: Int): Int = if (massToFuel(mass) <= 0) 0 else massToFuel(mass) + totalFuelNeeded(massToFuel(mass))
fun massToFuel(fuel: Int): Int = fuel / 3 - 2