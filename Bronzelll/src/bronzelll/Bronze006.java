package bronzelll;

import java.util.*;

public class Bronze006 { // 3�ð� �ɸ�

	public static void main(String[] args) { // �� �ȵ� �� : �ʹ� ��ư� ������, ���Ҹ��� 0�ʺ��� �︮�� ���� �ľ� ����(����� �� ����), �ٽ��ڵ��� ��ġ, while������ ����ϸ� �����ϰ� �ذ� ����
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String[] inputs = input.split(" ");
		int n = Integer.parseInt(inputs[0]);
		int l = Integer.parseInt(inputs[1]);
		int d = Integer.parseInt(inputs[2]);

		boolean time[] = new boolean[n * l + 5 * (n - 1)]; // boolean���� �Ǵ��ؼ� ǰ, �뷡�� ������� �ִ� �κ��� true�� ����
		for (int i = 0; i < n; i++) {
			int s = (l + 5) * i; // �뷡�� Ʋ���� ��ġ(�ٽ� �ڵ�)
			for (int j = s; j < s + l; j++) { // �뷡 ���̸�ŭ �÷���
				time[j] = true;
			}
		}
		int answer = 0; // ���Ҹ��� 0�ʺ��� �︮�Ƿ� 0���� �ʱ�ȭ �߿�!
		while (answer < time.length) { // ���Ҹ��� �︱ �ð���ŭ ��� ���س����鼭 false�̸� break�ϴ� �ǵ�, ���� �ð��� ��ü �迭�� ũ�⺸�� ũ�� �ٷ� break�ؾ��ϴϱ� while�� ������ �̷��� ��
			if (!time[answer]) // ���Ҹ��� �︮�� �ð��� false�̸�, ��, �ƹ��Ҹ��� ���� ���� �ʴٸ�
				break;
			answer += d;
		}
		System.out.println(answer); // ���� ���!
	}

}
