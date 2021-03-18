package bronzelll;

import java.util.*;

public class Bronze007 { // 11분 걸림

	public static void main(String[] args) { // 실수한 것 : 조건문에서 x==1이라고 함, answer는 계속해서 변하기 때문에 x == answer, y == answer이렇게 해야함
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		sc.nextLine();

		int answer = 1; // 처음에 공은 1번 컵에 있음, 중요 key point!
		for (int i = 0; i < M; i++) {
			String input = sc.nextLine();
			String[] inputs = input.split(" ");

			int X = Integer.parseInt(inputs[0]);
			int Y = Integer.parseInt(inputs[1]);

			if (X == answer) { // 컵 둘중에 하나라도 answer의 값이 포함되어 있으면, answer가 들어있지 않은 컵이 answer가 됨(바뀌므로) // 핵심 아이디어!
				answer = Y;
			} else if (Y == answer) {
				answer = X;
			}

		}
		System.out.println(answer); // 정답 출력
	}

}
