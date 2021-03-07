package ch3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		System.out.print("당신의 키는?");
		Scanner num1 = new Scanner(System.in);
		double height = num1.nextDouble();
		
		System.out.print("당신의 체중은?");
		Scanner num2 = new Scanner(System.in);
		double weight = num2.nextDouble();
		
		double avgWeight = (height - 100) * 0.9;
		
		System.out.println("----------");
		System.out.println("키를 입력하세요: " + height);
		System.out.println("몸무게를 입력하세요: " + weight);
		
		if(weight>avgWeight)
			System.out.println("과체중입니다.");
		else if(weight==avgWeight)
			System.out.println("표준체중입니다.");
		else
			System.out.println("저체중입니다.");
		
		num1.close();
		num2.close();
	}

}
