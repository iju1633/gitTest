package ch12;

import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		ArrayList<Double> array = new ArrayList<Double>();

		double sum = 0.0; // 0으로 초기화하는 거 중요해!
		double max = 0, min = 0; // 0으로 초기화하는 거 중요해!

		for (int i = 0; i < 10; i++) {
			System.out.print("심사위원의 점수: ");
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			array.add(input);

			// 최댓값 최솟값 구하는 과정
			for (int j = 0; j < array.size(); j++) {  // 배웠던거 잘 써먹었으!
				max = array.get(0);
				min = array.get(0);
				if (max < array.get(j)) {
					max = array.get(j);
				} 
				else if (min > array.get(j)) {
					min = array.get(j);
				}
			}
		}
		// 최댓값이랑 최솟값 뺴고 점수 합 구하는 과정
		array.remove(max);
		array.remove(min);
		for (int k = 0; k < array.size(); k++) {
			sum += array.get(k);
		}

		System.out.println("점수의 합: " + sum);
	}
}
