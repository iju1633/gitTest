package ch3class;

import java.util.*;

public class Ex3Mini {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		int answer = (int) (Math.random() * 100); // Math.random() * 100 �̰ſ� ��ȣ ���ϸ� Math.random()�̰� int�� �Ǵϱ� �׳� 0��. ���� �Լ� 0��!
		int i = 0;
		do {
			System.out.print("������ �����Ͽ����ÿ�: ");
			choice = sc.nextInt();

			if (choice > answer) {
				System.out.println("LOW");
			} else if (choice < answer) {
				System.out.println("HIGH");
			}
			i++;
		} while (choice != answer);
		System.out.println("�����մϴ�. �õ�Ƚ��=" + i);
	}

}
