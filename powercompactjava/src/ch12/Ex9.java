package ch12;

import java.util.*;

public class Ex9 {

	public static void main(String[] args) {

		HashSet<String> array = new HashSet<String>(); // HashSet�� ��� �ߺ����Ÿ� �˾Ƽ� �մϴ�.

		while (true) { // ���� �ݺ��մϴ�.

			String randomNum = Integer.toString((int) (Math.random() * 44 + 1));
			array.add(randomNum); // ������ �����ϰ� �ֽ��ϴ�.
			if (array.contains(randomNum)) { // ���� ������ HashSet�� �̹� �����ص� �ƹ��� �̺�Ʈ�� ó������ �ʽ��ϴ�.
			} else
				continue; // �������� �ʴ´ٸ� while ������ �̾�ϴ�.
			if (array.size() == 6) { // HashSet�� ũ�Ⱑ 6�̸� ��, ������ ������ 6���̸� while loop�� ���ɴϴ�.
				break;
			} else
				continue; // 6���� �۴ٸ�(6���� ũ�ٸ� ���� while������ ������ ���Դϴ�), while������ �ݺ��մϴ�.
		}
		System.out.println("Lotto [set=" + array + "]"); // ����� ��� �ڵ��Դϴ�.
	}
}