package bronzelll;

import java.util.*;

public class Bronze007 { // 11�� �ɸ�

	public static void main(String[] args) { // �Ǽ��� �� : ���ǹ����� x==1�̶�� ��, answer�� ����ؼ� ���ϱ� ������ x == answer, y == answer�̷��� �ؾ���
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		sc.nextLine();

		int answer = 1; // ó���� ���� 1�� �ſ� ����, �߿� key point!
		for (int i = 0; i < M; i++) {
			String input = sc.nextLine();
			String[] inputs = input.split(" ");

			int X = Integer.parseInt(inputs[0]);
			int Y = Integer.parseInt(inputs[1]);

			if (X == answer) { // �� ���߿� �ϳ��� answer�� ���� ���ԵǾ� ������, answer�� ������� ���� ���� answer�� ��(�ٲ�Ƿ�) // �ٽ� ���̵��!
				answer = Y;
			} else if (Y == answer) {
				answer = X;
			}

		}
		System.out.println(answer); // ���� ���
	}

}
