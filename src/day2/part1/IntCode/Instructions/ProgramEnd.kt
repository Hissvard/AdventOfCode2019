package day2.part1.IntCode.Instructions

class ProgramEnd : Base() {
    override val ipModifier: Int = 0
    override val opCode: Int = 99
    override fun run(state: List<Int>, ip: Int): List<Int> = state
}
