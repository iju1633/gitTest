package ch3;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("연산을 입력하세요:");
		String operator = sc.next();
		sc.nextLine();

		System.out.print("숫자 2개를입력하세요:");
		String input = sc.nextLine();
		String[] inputs = input.split(" ");

		double num1 = Double.parseDouble(inputs[0]);
		double num2 = Double.parseDouble(inputs[1]);

		if (operator.equals("+")) {
			System.out.print(num1 + "+" + num2 + " = " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.print(num1 + "-" + num2 + " = " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.print(num1 + "*" + num2 + " = " + (num1 * num2));
		} else if (operator.equals("/")) {
			if (num2 != 0)
				System.out.print(num1 + "/" + num2 + " = " + (num1 / num2));
			else
				System.out.println("분모에는 0이 올 수 없습니다.");
		} else
			System.out.println("올바르지 못한 연산자가 사용되었습니다.");

		sc.close();
	}

}
