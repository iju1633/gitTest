package bronzelll;

import java.util.*;

public class Bronze015 { // 30�� �ʰ�

	public static void main(String[] args) { // �־��� ���� N�� ���� ��� 2���� N�������� for���� ���� ��, ó���� N%i���� 0�� �ƴϸ� ���� �������� �Ѿ�� ��
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int j = 0; j < T; j++) {
			int N = sc.nextInt();

			int cnt = 0;

			for (int i = 2; i <= N; i++) {
				cnt = 0;
				if (N % i != 0) {
					continue;
				}
				while (N / i == 0) {
					array.add(N % i);
					N = N / i;
				}
				for (int k = 0; k < array.size(); k++) {
					if (array.get(k) == 0) {
						cnt++;
					} else {
						result.add(cnt);
						break;
					}
				}
			}
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
