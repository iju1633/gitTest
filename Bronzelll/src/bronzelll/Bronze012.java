package bronzelll;

import java.util.*;

public class Bronze012 { // �ô� 24, ���� 60, �ʴ� 60�ʱ����� �ִٴ� ����� �����ߴ�
						 // 3�� ����� �Ǻ��ϴ� ����� �ڸ����� ���ؼ� 3���� �������� ���ص� ������ ������ ��

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
