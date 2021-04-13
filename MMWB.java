package pipeline;

public class MMWB {
//memory operands are read and written to/fropm the memorry that is written in the instruction(destination register)
//loads and stores are used here
//logical operator instructions do nothing here
	
	private int readOffset;
	private int readALUResult;
	private int memRead;
	private int readReg;
	
	private int writeReg;
	private int	memWrite;
	private int memToReg;
	private int regToWrite;
	private int writeOffset;
	private int loadByteValue;
}
