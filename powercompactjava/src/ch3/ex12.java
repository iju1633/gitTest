package ch3;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) { // �߰� �������� ����� ������ ���� ���� �Է¹��� �� ����
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		for (int i = 0; i < 5; i++) {
			System.out.print("������ �Է��ϼ���: ");
			double input = sc.nextDouble();
			sum += input;
		}

		System.out.println("�հ� : " + (int) sum);
		System.out.println("��� : " + sum / 5);

	}

}