package ch3Assignment;

import java.util.ArrayList;

public class EX3_2 {

	public static void main(String[] args) {
		System.out.print("2���� 100������ �Ҽ�: ");
		for (int k = 2; k <= 100; k++) {
			ArrayList<Integer> factor = new ArrayList<>(); // for �ȿ� �־ �ݺ��ɶ����� ���� �������
			for (int j = 2; j <= k - 1; j++) { // 2���� k-1���� ����� �������� �� ������ �ȵ�
				if (k % j == 0) {
					factor.add(k);
				}
			}
			if (factor.size() == 0) {
				System.out.print(k + " ");
			}
		}
	}

}
