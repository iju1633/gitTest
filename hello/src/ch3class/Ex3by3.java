package ch3class;

import java.util.*;

public class Ex3by3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2): ");
		int choice = sc.nextInt();

		final int sci = 0;
		final int rock = 1;
		final int pap = 2;

		int computer = (int) Math.random() * 3; // 0���� 2���� ������ ���� ��Ÿ��

		System.out.printf("�ΰ�: %d ��ǻ��: %d   ", choice, computer);

		if (choice == computer) {
			System.out.println("�����");
		} else if (choice == (computer + 1) % 3) { // key point!
			System.out.println("�ΰ� �¸�");
		} else
			System.out.println("��ǻ�� �¸�");
	}

}
