package uilWritten;

public class BitShifts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(~2); // 00000010 -> 11111101 -> -1
		// 10 -> 1010
		//       0101  -> 5
		// 00001010 -> 11110101 ->
		//              ^- first number denotes a sign... 
		System.out.println(~~10);
	}

}
