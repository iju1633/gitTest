package ch3;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) { // 추가 조건으로 몇명의 성적을 받을 건지 입력받을 수 있음
		Scanner sc = new Scanner(System.in);
		double sum = 0.0;
		for (int i = 0; i < 5; i++) {
			System.out.print("성적을 입력하세요: ");
			double input = sc.nextDouble();
			sum += input;
		}

		System.out.println("합계 : " + (int) sum);
		System.out.println("평균 : " + sum / 5);

	}

}