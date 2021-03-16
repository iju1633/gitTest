package bronzelll;

import java.util.*;

public class Bronze004 { // 22분 소요

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 20 이하의 수
		sc.nextLine();
		String input = sc.nextLine();
		String[] inputs = input.split(" ");

		int[] time = new int[N]; // inputs의 Integer 버젼
		for (int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(inputs[i]);
		}

		int M = 0, Y = 0; // 총 요금이 들어갈 변수

		for (int a : time) {
			Y += 10 * (a / 30 + 1); // 30초를 다 안써도 기본 요금이 있으니 몫에다가 +1 해줘야함
			M += 15 * (a / 60 + 1);
		}

		if (M == Y) {
			System.out.println("Y M " + M); //  요금값이 더 작은 것을 요금제로 설정함
		} else if (M > Y) {
			System.out.println("Y " + Y);
		} else
			System.out.println("M " + M);

	}

}
