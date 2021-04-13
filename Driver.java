package pipeline;

public class Driver {


	public static void main(String args[]) {

		//mask registers
		int rs = 0x03E00000;
		int rt = 0x001F0000;
		int rd = 0x0000F800;
		int funct = 0x0000003F;
		int offset = 0x0000FFFF;

		short Main_Mem[] = new short[0x400];
		int Regs[] = new int[32];

		//initialize main memory{
		for(int m =0; m< 0x400;m++) {
			Main_Mem[m] = (short) (m & 0xFF);
		}
		//initialize registers
		for(int r = 0;r<32;r++) {
			Regs[r] = (r +0x100);
		}
		
		int[] machineInstructions = new int[] { 0xa1020000, 0x810afffc, 0x00831820, 0x1263820, 0x1224820, 0x81180000,
				0x81510010, 0x00624022, 0X00000000, 0x00000000, 0x00000000, 0x00000000 };




	}

}