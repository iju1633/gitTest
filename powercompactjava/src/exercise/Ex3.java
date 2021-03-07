package exercise;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String input  = a.nextLine();
		
		for(int i=1; i<16; i++) {
			System.out.println(input + "*" + Integer.toHexString(i).toUpperCase() + "=" 
		+ Integer.toHexString(Integer.parseInt(input,16)*i).toUpperCase());
		}
	}
}
