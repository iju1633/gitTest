package bronzelll;

import java.util.*;

public class Bronze004 { // 22�� �ҿ�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 20 ������ ��
		sc.nextLine();
		String input = sc.nextLine();
		String[] inputs = input.split(" ");

		int[] time = new int[N]; // inputs�� Integer ����
		for (int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(inputs[i]);
		}

		int M = 0, Y = 0; // �� ����� �� ����

		for (int a : time) {
			Y += 10 * (a / 30 + 1); // 30�ʸ� �� �Ƚᵵ �⺻ ����� ������ �򿡴ٰ� +1 �������
			M += 15 * (a / 60 + 1);
		}

		if (M == Y) {
			System.out.println("Y M " + M); //  ��ݰ��� �� ���� ���� ������� ������
		} else if (M > Y) {
			System.out.println("Y " + Y);
		} else
			System.out.println("M " + M);

	}

}
