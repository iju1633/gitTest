package bronzelll;

import java.util.*;

public class Bronze001 { // ���ƴ� �κ� : (1 �� a < 100, 1 �� b < 1,000,000)�̱⿡ ���ڰ� �ʹ� Ŀ�� java�� ǥ���� �ȵȴٴ� ��  30�� �ҿ�
						 // �׷��� pow �ż���� ���� �ȵȴٴ� ��
						 // a�� 10�� �Ѿ �� �ִٴ� ��. ���� �ڸ����� ������ �ϴٺ��� ��ħ
						 // a%10 == 0�� ���, ��, a�� 10�� ����� ��츦 ó���� �߰� ����

	public static void main(String[] args) { // a�� 1���� 99���� �����ϱ⿡ Ʋ�ȴ� ����
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt(); // �׽�Ʈ ���̽��� �� �Է¹���
		sc.nextLine();

		int[] array2 = { 2, 4, 8, 6 }; // ���� ���� ��� ���س����� ���� �ڸ��� ��ȯ�� ���� Ȯ��
		int[] array3 = { 3, 9, 7, 1 };
		int[] array4 = { 4, 6 };
		int[] array7 = { 7, 9, 3, 1 };
		int[] array8 = { 8, 4, 2, 6 };
		int[] array9 = { 9, 1 };

		int[] array = new int[time];

		for (int i = 0; i < time; i++) { // �׽�Ʈ ���̽� �� ��ŭ �ݺ��ؼ� ������� ������ ��
			String input = sc.nextLine();
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]); // a : ���� ���� ����
			int b = Integer.parseInt(inputs[1]); // b : ���� ���� ����

			int index1 = b % 4 - 1; // index�� 0���� �����ϱ⿡ 1�� ����
			if (index1 == -1) { // 4��° ���ڸ� �θ��� ���� ���. 4�� �����⿡ �ؾ��ϴ� ���� -> key point!
				index1 = 3;
			}

			int index2 = b % 2 - 1; // 4�� 2�� ������ ���� ���� �迭�� ���Ҽ��� 4�ų� 2�̱� ����
			if (index2 == -1) { // 4���� ������ ����
				index2 = 1;
			}

			switch (a % 10) { // 1���� 9���� ���� �ڸ� ���� array�迭�� ����, a�� ������ 1~99���� ������. �׷��� a%10���� ó��. ��� ������ ���� ����.
			case 0: // �� ó���� a�� 10�� �� �� �ִٴ� ���� �ذ� �־���
				array[i] = 10;
				break;
			case 1:
				array[i] = 1;
				break;
			case 2:
				array[i] = array2[index1];
				break;
			case 3:
				array[i] = array3[index1];
				break;
			case 4:
				array[i] = array4[index2];
				break;
			case 5:
				array[i] = 5;
				break;
			case 6:
				array[i] = 6;
				break;
			case 7:
				array[i] = array7[index1];
				break;
			case 8:
				array[i] = array8[index1];
				break;
			case 9:
				array[i] = array9[index2];
				break;
			}
		}
		for (int i = 0; i < array.length; i++) { // ���ʴ�� array ���Ҹ� ���
			System.out.println(array[i]);
		}
	}

}
