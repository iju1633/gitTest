package ch3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���: ");
		double height = num.nextDouble();

		System.out.print("�����Ը� �Է��ϼ���: ");
		double weight = num.nextDouble();

		double avgWeight = (height - 100) * 0.9;

		if (weight > avgWeight)
			System.out.println("��ü���Դϴ�.");
		else if (weight == avgWeight)
			System.out.println("ǥ��ü���Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");

	}

}
