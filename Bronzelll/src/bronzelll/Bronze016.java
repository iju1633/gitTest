package bronzelll;

import java.util.*;

public class Bronze016 { // 14분 성공! : 그림을 그려서 관게성을 찾았다. -N+1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int result = 0;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			result += num - 1;
		}

		System.out.println(result + 1);
	}

}
