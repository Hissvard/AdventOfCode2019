package day2.part1.intcode

import day2.part1.intcode.instruction.Add
import day2.part1.intcode.instruction.End
import day2.part1.intcode.instruction.Instruction
import day2.part1.intcode.instruction.Multiply

class InstructionRepository {
    companion object {
        fun fromCode(code: Int): Instruction {
            val map = mapOf(
                1 to Add(),
                2 to Multiply(),
                99 to End()
            )

            return map[code]!!
        }
    }
}
