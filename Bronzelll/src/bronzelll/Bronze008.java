package bronzelll;

import java.util.*;

public class Bronze008 { // 21�� �ɸ�

	public static void main(String[] args) { // �������� ���ߴ� �� : width�� ���ؼ��� 4*n + 4�� ��� ó���� �� ����������, height�� ��� ������
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int height = 0;
		int width = 0;

		if (a % 4 == 0 && b % 4 != 0) {
			height = (int) (Math.abs(4 - b % 4));
			width = (int) (Math.abs((a - 4) / 4 - (b - b % 4) / 4));
		} else if (a % 4 != 0 && b % 4 == 0) {
			height = (int) (Math.abs(4 - a % 4));
			width = (int) (Math.abs((a - a % 4) / 4 - (b - 4) / 4));
		} else if (a % 4 == 0 && b % 4 == 0) {
			height = 0;
			width = (int) (Math.abs((a - 4) / 4 - (b - 4) / 4));
		} else {
			height = (int) (Math.abs(a % 4 - b % 4));
			width = (int) (Math.abs((a - a % 4) / 4 - (b - b % 4) / 4));
		}

		System.out.println(height + width);
	}

}
