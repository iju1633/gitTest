package ch3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		double height = num.nextDouble();

		System.out.print("몸무게를 입력하세요: ");
		double weight = num.nextDouble();

		double avgWeight = (height - 100) * 0.9;

		if (weight > avgWeight)
			System.out.println("과체중입니다.");
		else if (weight == avgWeight)
			System.out.println("표준체중입니다.");
		else
			System.out.println("저체중입니다.");

	}

}
