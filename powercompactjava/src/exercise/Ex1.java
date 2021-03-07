package exercise;

import java.util.Scanner;

public class Ex1 {
	static int A, B, N = 0;
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String[] array = input.split(" ");
		
		B = Integer.parseInt(array[0]);
		N = Integer.parseInt(array[1]);
		
		int resultA = 0;
		double expression = Math.pow(B, (double)1/N); //A의 double값 받음.
		int intVersionOfExpression = (int) expression; // A의 정수부분.
		double result1 = Math.abs(B - Math.pow(intVersionOfExpression, N));
		double result2 = Math.abs(B - Math.pow(intVersionOfExpression-1, N));
		double result3 = Math.abs(B - Math.pow(intVersionOfExpression+1, N));
		if((result1 <= result2) && result1 <= result3) {
			resultA = intVersionOfExpression;
		}
		else if((result2 <= result1) && result2 <= result3) {
			resultA = intVersionOfExpression-1;
		}
		else if((result3 <= result1) && result1 <= result2) {
			resultA = intVersionOfExpression+1;
		}
		
		System.out.println(resultA);
	}
}