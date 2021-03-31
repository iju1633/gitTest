package bronzelll;

import java.util.*;

public class Bronze014 { // 25분만에 성공!

	public static void main(String[] args) { // 부족했던 점 : 왜 관계식을 다 안쓰고 풀면서 풀려고해?
											 // 출력이 처음에 2번 있었다
											 // 1<= N <= 10000000이므로 계산하다보면 integer를 넘게 된다(이것 때매 계속 틀림)
		Scanner sc = new Scanner(System.in);
		int phase = sc.nextInt();

		int result = 5;

		
		for (int i = 2; i <= phase; i++) {
			if (phase == 1) {
				result = 5;
				break;
			}

			result = result + 5 * i;
			result = result - 2 * i + 1;
			result = result % 45678; // key point!

		}
		System.out.println(result);
	}

}
