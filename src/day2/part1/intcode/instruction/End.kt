package day2.part1.intcode.instruction

class End : Instruction() {
    override val modifier = 0

    override fun run(state: List<Int>, executionIndex: Int): List<Int> {
        return state
    }

    override fun isEnd(): Boolean {
        return true
    }
}
