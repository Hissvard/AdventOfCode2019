package day2.part1.IntCode.Instructions

class Multiply : Base() {
    override val opCode: Int = 2
    override val ipModifier: Int = +4
    override fun run(state: List<Int>, ip: Int): List<Int> {
        val aPosition = state[ip] + 1
        val bPosition = state[ip] + 2
        val resultPosition = state[ip] + 3

        val a = state[aPosition]
        val b = state[bPosition]

        val newState = state.toMutableList()
        newState[resultPosition] = a * b

        return newState
    }
}