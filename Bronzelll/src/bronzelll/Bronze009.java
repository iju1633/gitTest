package bronzelll;

import java.util.*;

public class Bronze009 { // 20�� �ɸ�

	public static void main(String[] args) { // �Ǽ��� �� : �ڵ� ¥�µ� �����ؼ� 0�Է±��� ��� �Է¹޾ƾ��ϴ� ����� ������
												// ���� �� : ���̵� ���� �� ��üȭ��, ��� �� ���� ��ü������ ������� ���� ���� ������, 2���� ��� �Ǵ��ؾ��ϴ�
												// �����ε� ���̵� �� �����ؼ� for�� �ѹ����� ������ �ذ��� �� �ְ� ��!! key point!!
		Scanner sc = new Scanner(System.in);
		String input;

		ArrayList<Integer> result = new ArrayList<Integer>();
		while (true) {
			input = sc.nextLine();

			if (input.equals("0")) {
				break;
			}

			String[] inputs = input.split(" ");

			int[] array = new int[inputs.length];
			for (int i = 0; i < inputs.length; i++) {
				array[i] = Integer.parseInt(inputs[i]);
			}

			int a = 1;
			for (int i = 1; i < array.length - 1; i += 2) { // key point! 2�� for���� ������� �ʾƵ� ��(����, ���̴� �ʿ����� �ʴٴ� ���� ���޾� i��
															// 1���� ������)
				a = a * array[i] - array[i + 1];
			}
			result.add(a);
		}

		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

}
