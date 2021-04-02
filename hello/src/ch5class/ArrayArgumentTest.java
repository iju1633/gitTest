package ch5class;

import java.util.Arrays;

public class ArrayArgumentTest {
	
	public static double minArray(double[] list) {
		double min = list[0];

		for (int i = 1; i < list.length; i++) { // ���� ���� min = list[0]; �̶�� �ص� i�� 0���� �����߾���. ���ʿ��� i�� �����̾��� ��
			if (list[i] < min) {
				min = list[i];
			}
		}
		return min;
	}

	public static void addArray(double[] list, int len) {
		for (int i = 0; i < list.length; i++) {
			list[i]++;
		}
		len++;
	}

	public static void main(String[] args) {

		double[] a = { 1.1, 2.2, 3.3, 4.4, 0.1, 0.2 };
		double[] b = { -2.0, -3.0, -9.0, 2, 9, 1, 5 };

		double min = minArray(a); // static �ż����̱� ������ �ٷ� ����ϸ� ��
		System.out.println("a �迭�� �ּڰ� = " + min);
		double min2 = minArray(b);
		System.out.println("b �迭�� �ּڰ� = " + min2);

		System.out.println(Arrays.toString(a) + " length :" + a.length);
		addArray(a, a.length); // addArray�ż��忡�� �Ű����� len�� int�� �����̱⿡ �ż��忡�� ++�ص� ���� ������ ����(�������� �ƴ�!)
		System.out.println(Arrays.toString(a) + " length :" + a.length);

	}

}
