package bronzelll;

import java.util.*;

public class Bronze011 { // 24�� �ɸ�
	// �м��� 2�� �ɷȴµ� �м��ð��� �� �� �Ҿ��ؼ� ��� Ǯ�� �Ϻ��� �����ߴٸ� Ʋ���� �� ���� �� ���� ������ �� ����
	public static void main(String[] args) { // �����ߴ� �� : switch case ���� �򰥸�, Ư������ \�� ��Ÿ������ �� �� \\, ���ϴ� i�� ����� Ȱ���ϱ�
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>(); // ��������� ���� �迭
		while (true) {

			String input = sc.next();
			if (input.equals("#")) { // �Է¹��� ���� #�̸� ����
				break;
			}
			String[] inputs = input.split("");
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				switch (inputs[i]) { // �Է¹��� �͵��� ���� ����� ���ڷ� �ٲ��ش�
				case "-":
					inputs[i] = "0";
					break;
				case "\\":
					inputs[i] = "1";
					break;
				case "(":
					inputs[i] = "2";
					break;
				case "@":
					inputs[i] = "3";
					break;
				case "?":
					inputs[i] = "4";
					break;
				case ">":
					inputs[i] = "5";
					break;
				case "&":
					inputs[i] = "6";
					break;
				case "%":
					inputs[i] = "7";
					break;
				case "/":
					inputs[i] = "-1";
					break;
				}
				// ���ڴ� ������ �ٲٰ�, �� ���� ���ʴ�� 8�� ������ ����-i-1 ������ �ؼ� ��� ���س�����
				sum += (Integer.parseInt(inputs[i]) * (int) Math.pow(8, input.length() - i - 1)); // key point!!
			}
			array.add(sum); // ������� array�� ����
		}
		for (int i = 0; i < array.size(); i++) { // ����� ���
			System.out.println(array.get(i));
		}
	}

}
