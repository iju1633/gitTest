package bronzelll;

import java.util.*;

public class Bronze014 { // 25�и��� ����!

	public static void main(String[] args) { // �����ߴ� �� : �� ������� �� �Ⱦ��� Ǯ�鼭 Ǯ������?
											 // ����� ó���� 2�� �־���
											 // 1<= N <= 10000000�̹Ƿ� ����ϴٺ��� integer�� �Ѱ� �ȴ�(�̰� ���� ��� Ʋ��)
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
