package ch3;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		String operator = sc.next();
		sc.nextLine();

		System.out.print("���� 2�����Է��ϼ���:");
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
				System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
		} else
			System.out.println("�ùٸ��� ���� �����ڰ� ���Ǿ����ϴ�.");

		sc.close();
	}

}
