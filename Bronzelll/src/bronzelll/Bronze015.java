package bronzelll;

import java.util.*;

public class Bronze015 { // 30�� �ʰ�, outer loop �κ��� �պ� ��!

	public static void main(String[] args) { // �־��� ���� N�� ���� ��� 2���� N�������� for���� ���� ��, ó���� N%i���� 0�� �ƴϸ� ���� �������� �Ѿ�� ��
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int j = 0; j < T; j++) {
			int N = sc.nextInt();

			ArrayList<Integer> array = new ArrayList<Integer>();
			int cnt = 1; // ó���� N/i != 0 �̸� ���� �������� �Ѿ���Ƿ� 0�̶�� �ϴ� 1�� �ʱⰪ�� �Ǿ����

			for (int i = 2; i <= N; i++) {

				if(N/i != 0) {
					continue;
				}
				outer: while (true) {
					array.add(N % i);
					N = N - (N / i) * (N % i);
					if (N / i == 0) {
						for (int k = 0; k < array.size(); k++) {
							if (array.get(k) == 0) {
								cnt++;
							} else {
								result.add(cnt);
								break outer;
							}
						}
					}

				}
			}

			for (int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}
		}
	}

}
