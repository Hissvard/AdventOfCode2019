package day2.part1.IntCode

import day2.part1.IntCode.Instructions.Add
import day2.part1.IntCode.Instructions.Base
import day2.part1.IntCode.Instructions.Multiply
import day2.part1.IntCode.Instructions.ProgramEnd

class InstructionRepository {
    fun find(opCode: Int): Base? {
        val instructions = listOf(
            Add(),
            Multiply(),
            ProgramEnd()
        )

        return instructions.find { it.opCode == opCode }
    }
}
