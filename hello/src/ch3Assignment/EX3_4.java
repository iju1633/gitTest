package ch3Assignment;

import java.util.*;

public class EX3_4 {

	public static void main(String[] args) { // switch���� ��� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		String operator = sc.next();
		sc.nextLine();

		System.out.print("���� 2���� �Է��ϼ���: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();

		if (operator.equals("+")) {
			System.out.print(num1 + "+" + num2 + " = " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.print(num1 + "-" + num2 + " = " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.print(num1 + "*" + num2 + " = " + (num1 * num2));
		} else if (operator.equals("/")) {
			if (num2 == 0)
				System.out.println("0���� ���� �� �����ϴ�."); // �����Բ��� 0���� ���� �� ���� ��쿡 ó���϶�� �Ͻ� ����
			else
				System.out.print(num1 + "/" + num2 + " = " + (num1 / num2));
		}
	}

}
