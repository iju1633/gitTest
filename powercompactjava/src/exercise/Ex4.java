package exercise;

import java.util.*;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int a = input; // ���� �� ����
		int b = 0; // ���� ���� ����
		for (int i = 0; i < input; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(" ");
			}
			for (int k = a; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
			a--;
			b++;
		}

	}
}
