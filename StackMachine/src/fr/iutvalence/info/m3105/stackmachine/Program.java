package fr.iutvalence.info.m3105.stackmachine;

public class Program {

	private int size;
	private Instruction[] Instruction;
	
	public Program(Instruction[] instructions) {
		this.size = instructions.length;
	}

	public int getInstructionCount() {
		return size;
		
	}

	public Instruction getInstructionAt(int instructionNumber) {
		return Instruction[instructionNumber];
	}

}
