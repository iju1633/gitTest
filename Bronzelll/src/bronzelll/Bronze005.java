package bronzelll;

import java.util.*;

public class Bronze005 {

	public static void main(String[] args) { // 15�� �ҿ�
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while (true) {
			int input = sc.nextInt();
			if (input == 0) { // 0 ���� ������ �Է°� �޴� ��
				break;
			}

			int sum = 0;

			for (int i = 0; i < Integer.toString(input).length(); i++) { // ���� �� : �Է¹��� �������� split���� �ʰ� charAt���� ó���� ��, ��ü �����κ��� �ݺ��� �ȿ� ���� ���� ��, list�� �ݺ��� �ۿ� �����ؼ� ����� ���ϰ� �� ��
				if (Integer.toString(input).charAt(i) == '1') { // �Ǽ��� �κ� : ó���� charAt(0)�̶�� ��
					sum += 2;
				} else if (Integer.toString(input).charAt(i) == '0') {
					sum += 4;
				} else
					sum += 3;
			}

			sum += Integer.toString(input).length() - 1 + 2; // ���� ������ ����� ȣ���� �������� ������ ����� ��
			array.add(sum);
		}

		for (int i = 0; i < array.size(); i++) { // ����� ���
			System.out.println(array.get(i));
		}
	}

}
