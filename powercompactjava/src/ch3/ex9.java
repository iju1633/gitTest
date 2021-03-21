package ch3;

import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 개수: ");
		int input = sc.nextInt();

		int[] array = new int[input];
		array[0] = 0;
		array[1] = 1;
		for (int i = 0; i < input - 2; i++) {
			array[i + 2] = array[i] + array[i + 1];
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
