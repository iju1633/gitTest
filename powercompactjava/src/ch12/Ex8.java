package ch12;

import java.util.*;

public class Ex8 {

	public static void main(String[] args) {
		ArrayList<Double> array = new ArrayList<Double>();

		double sum = 0.0; // 0���� �ʱ�ȭ�ϴ� �� �߿���!
		double max = 0, min = 0; // 0���� �ʱ�ȭ�ϴ� �� �߿���!

		for (int i = 0; i < 10; i++) {
			System.out.print("�ɻ������� ����: ");
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			array.add(input);

			// �ִ� �ּڰ� ���ϴ� ����
			for (int j = 0; j < array.size(); j++) {  // ������� �� ��Ծ���!
				max = array.get(0);
				min = array.get(0);
				if (max < array.get(j)) {
					max = array.get(j);
				} 
				else if (min > array.get(j)) {
					min = array.get(j);
				}
			}
		}
		// �ִ��̶� �ּڰ� ���� ���� �� ���ϴ� ����
		array.remove(max);
		array.remove(min);
		for (int k = 0; k < array.size(); k++) {
			sum += array.get(k);
		}

		System.out.println("������ ��: " + sum);
	}
}
