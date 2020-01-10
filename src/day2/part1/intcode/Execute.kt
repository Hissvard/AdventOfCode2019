package day2.part1.intcode

sealed class StepResult {
    object End : StepResult()
    data class NewState(val state: List<Int>) : StepResult()
}

class Execute(script: String) {
    var state = script.split(',').map { it.toInt() }
    var executionIndex = 0

    fun step(): StepResult {
        val instructionInt = state[executionIndex]
        val instruction = InstructionRepository.fromCode(instructionInt)

        if (instruction.isEnd()) {
            return StepResult.End
        }

        state = instruction.run(state, executionIndex)
        executionIndex += instruction.modifier

        return StepResult.NewState(state)
    }

    fun eachStep(action: (List<Int>) -> Unit) {
        while (true) {
            val result = this.step()

            if (result is StepResult.End) {
                break
            } else if (result is StepResult.NewState) {
                action(result.state)
            } else {
                throw RuntimeException()
            }
        }
    }
}