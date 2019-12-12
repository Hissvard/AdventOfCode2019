package day2.part1.IntCode

import day2.part1.IntCode.Instructions.Base

class Parser {
    fun instructions(script: String): List<Base> {
        val instructionCodes = script.split(',').map { it.trim().toInt() }

        var ip = 0
        val instructions = listOf<Base>().toMutableList()
        while(true) {
            val currentInstructionCode = instructionCodes[ip]
            val currentInstruction = InstructionRepository().find(currentInstructionCode)

            if (currentInstruction!!.opCode == 99) break

            instructions.add(currentInstruction)

            ip += currentInstruction.ipModifier
        }

        return instructions
    }
}
