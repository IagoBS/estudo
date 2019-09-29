package curso;

import java.util.Scanner;

public class BitABit {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0 ) {
	   System.out.println(" Na operação & o bit é TRUE");
		}else{
			System.out.println("Na operação & esse bit é FALSE");
		}
		if((n | mask) != 0) {
			System.out.println("Na operação | esse bit é TRUE");
		} else {
			System.out.print("Na operação | esse bit é FALSE");
		}
		if((n ^ mask) != 0) {
			System.out.println("Na operação ^ esse bit é TRUE");
		} else {
			System.out.println("Na operação ^ esse bit é false");
		}

	}

}
