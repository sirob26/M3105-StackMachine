package fr.iutvalence.info.m3105.stackmachine;

public class Instruction {
	
	private int opCode;
	private int[] value;
	
	public Instruction(int opCode, int[] value) {
		this.opCode = opCode;
		this.value = value;
		
	}
	public int getOpCode() {
		return opCode;
	}
	public int[] getParams() {
		return value;
	}

	
}
