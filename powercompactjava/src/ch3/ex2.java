package ch3;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<1)
			System.out.println("OTHER");
		else if(num == 2)
			System.out.println("TWO");
		else if(num == 3)
			System.out.println("THREE");
		else if(num == 4)
			System.out.println("FOUR");
		else if(num == 5)
			System.out.println("FIVE");
		else if(num == 6)
			System.out.println("SIX");
		else if(num == 7)
			System.out.println("SEVEN");
		else if(num == 8)
			System.out.println("EIGHT");
		else if(num == 9)
			System.out.println("NINE");
		else
			System.out.println("OTHER");
		
		sc.close();
	}
}
