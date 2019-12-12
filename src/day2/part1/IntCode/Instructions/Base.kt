package day2.part1.IntCode.Instructions

abstract class Base {
    abstract val opCode: Int
    abstract val ipModifier: Int
    abstract fun run(state: List<Int>, ip: Int): List<Int>
}
