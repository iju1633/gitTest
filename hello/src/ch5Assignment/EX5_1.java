package ch5Assignment;

import java.util.*;

public class EX5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		System.out.println("---------------------");
		System.out.println("0 1 2 3 4 5 6 7 8 9");
		System.out.println("---------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		while (true) {

			System.out.println();
			System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
			int input = sc.nextInt();


			if (array[input] == 1) { // ������ ���ÿ� ���¸� ���߱� ���� ������ �� �� ���� ��찡 �߻��ϸ� �����Ҽ������ϴ�.��� ���� ��� ��, �¼��� �����ְ� ������
				System.out.println("�����Ҽ������ϴ�.");
				System.out.println();
				System.out.println("---------------------");
				System.out.println("0 1 2 3 4 5 6 7 8 9");
				System.out.println("---------------------");
				for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
				}
				System.out.println();
				break;

			} else {
				array[input] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}

			System.out.println();
			System.out.println("---------------------");
			System.out.println("0 1 2 3 4 5 6 7 8 9");
			System.out.println("---------------------");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}
	}

}
