package day2.part1.intcode.instruction

class Add : Instruction() {
    override val modifier = 4

    override fun run(state: List<Int>, executionIndex: Int): List<Int> {
        val newState = state.toMutableList()

        val aIndex = state[executionIndex + 1]
        val bIndex = state[executionIndex + 2]
        val resultIndex = state[executionIndex + 3]

        newState[resultIndex] = newState[aIndex] + newState[bIndex]

        return newState
    }
}
