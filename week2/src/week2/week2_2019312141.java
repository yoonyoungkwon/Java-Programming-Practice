package week2;

import java.util.Scanner;

public class week2_2019312141 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int i = scn.nextInt();
		String b = Integer.toBinaryString(i);
		String o = Integer.toOctalString(i);
		String h = Integer.toHexString(i);
		
		System.out.print("b ");
		System.out.println(b);
		System.out.print("o ");
		System.out.println(o);
		System.out.print("h ");
		System.out.print(h);
	}

}
