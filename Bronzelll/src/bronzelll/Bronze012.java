package bronzelll;

import java.util.*;

public class Bronze012 { // 시는 24, 분은 60, 초는 60초까지만 있다는 사실을 망각했다
						 // 3의 배수를 판별하는 방법은 자릿수를 합해서 3으로 나눠지는 기준도 있으니 참고할 것

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> result = new ArrayList<>();

		for (int k = 0; k < 3; k++) {
			String[] first = new String[3];
			String[] second = new String[3];

			String input = sc.nextLine();
			String[] inputs = input.split(" ");

			first = inputs[0].split(":");
			second = inputs[1].split(":");

			String a = "";
			String b = "";
			for (int i = 0; i < 3; i++) {
				a = a + first[i];
				b = b + second[i];
			}

			int one = Integer.parseInt(a);
			int two = Integer.parseInt(b);

			int cnt = 0;
			if (one > two) {
				for (int i = one; i <= 235959; i++) {

					if (i % 3 == 0) {
						cnt++;
					}
				}
				for (int i = 0; i <= two; i++) {
					if (i % 3 == 0) {
						cnt++;
					}
				}
				result.add(cnt);
			} else {
				for (int i = one; i <= two; i++) {
					if (i % 3 == 0) {
						cnt++;
					}
				}
				result.add(cnt);
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(result.get(i));
		}
	}

}
