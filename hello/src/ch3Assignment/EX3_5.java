package ch3Assignment;

import java.util.Scanner;

public class EX3_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ����: ");
		int input = sc.nextInt();

		int[] array = new int[input];
		array[0] = 0;
		array[1] = 1;
		for (int i = 1; i < input - 1; i++) {
			array[i + 1] = array[i] + array[i-1]; // �־��� ���ǿ� �°� ó���ؾ���
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
