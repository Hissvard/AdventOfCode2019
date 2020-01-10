package day2.part1.intcode.instruction

abstract class Instruction {
    abstract val modifier: Int
    abstract fun run(state: List<Int>, executionIndex: Int): List<Int>

    open fun isEnd(): Boolean {
        return false
    }
}
