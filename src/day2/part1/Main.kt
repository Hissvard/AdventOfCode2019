package day2.part1

import day2.part1.IntCode.Parser

fun main() {
    val testScript = "1,9,10,3,2,3,11,0,99,30,40,50"
    val instructions = Parser().instructions(testScript)


}
