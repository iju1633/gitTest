package ch3;

import java.util.*;

public class ex6 {

	public static void main(String[] args) {
		System.out.print("2���� 100���� ��� �Ҽ� :  ");
		for (int i = 2; i <= 100; i++) {
			ArrayList<Integer> factor = new ArrayList<>(); // for �ȿ� �־ �ݺ��ɶ����� ���� �������
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					factor.add(i);
				}
			}
			if (factor.size() == 2) { // factor�� 1�� �ڱ� �ڽ� �̷��� 2�����, prime�̴�
				System.out.print(i + " ");
			}
		}
	}
}
