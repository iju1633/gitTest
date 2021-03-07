package baekjoonGold;

import java.util.ArrayList;
import java.util.Scanner;

public class �����ϴ¼� { // ������ �� : while �������� 1,000,001�� �������ϴ� �޸𸮰� �翬 ������ ���̴�. ��Ģ�� ã�� �迭�� ������ �ʿ䰡 ���� �غ���.

	/*
	 * PROBLEM �ְ��ڸ����� ������ �����ڸ����� ������ ��� �����ؾ� �����ϴ� ���� input���� N�� �־����� N��° �����ϴ� ����
	 * ����ϸ� ��. �����ϴ� �� >= 0
	 */

	/*
	 * IDEA 1. �����ϴ� ���� List�迭�� ���� ����(while true �������� �迭�� ũ�Ⱑ 1,000,001���� Ŀ���� break;
	 * -> N�� 1,000,000���� �۰�, 0�� 0��° �����ϴ� ����� �����ϱ� �����ϴ� ���� �� �迭�� ũ��� �ִ�
	 * 1,000,001�̴�. 2. N�� �Է¹޾Ƽ� �����ϴ� ���� ���� �迭�� N��° index�� ���� ����ϸ� ��(index�� 0����
	 * �����ϴµ�, 0�� 0��° �����ϴ� ����� �����)
	 */

	public static void main(String[] args) {

		ArrayList<Integer> reduceNumArray = new ArrayList<Integer>(); // �����ϴ� ���� �� �迭

		boolean isReduceNum = true;
		boolean check = true;
		int num = 0; // �� ������ while ���� �ȿ� ������ ��� �ʱ�ȭ �ǹǷ� �迭�ȿ� �� ���ڴ� 0�ۿ� ����.

		while (true) {
			if (num < 10) {
				reduceNumArray.add(num); // �ڸ����� �� �ڸ��� �� �����ϴ� ����. num++������ �̷�������ϹǷ� continue�� ���� �ȵ�.
			} else {
				String number = Integer.toString(num); // num�� String���� �ٲ㼭 split�ϰ� �� �ڸ����� ���� ����.
				String[] numbers = number.split("");

				for (int i = 0; i < numbers.length - 1; i++) {
					if (Integer.parseInt(numbers[i]) <= Integer.parseInt(numbers[i + 1])) {
						isReduceNum = false;
					}
					if (isReduceNum == false) { // ��� �ڸ����� �� ���� �Ŀ� �ϳ��� ���ǿ� �� ������ num++�� �ؾ��ϹǷ� check ������ �ϳ��� ������.
						check = false; // �����ϴ� ���� �ƴ� ��, check�� ����. �ƴϸ� ��� true��.
					}
				}
				if (check == true) { // �ڸ��� ���� �� ���غ��鼭 ������ ������ �� �����ߴٸ�,
					reduceNumArray.add(num);
				}
			}
			num++; // num�� 0���� 1�� �ö󰡸� �����ϴ� ������ �Ǵ��� ����.

			if (reduceNumArray.size() > 1000001) { // N�� ������ ���� �迭�� �ִ� ũ�⸦ �� �� �־���.
				break;
			}
		}

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (reduceNumArray.get(N) == null) {
			System.out.println("-1");
		} else
			System.out.println(reduceNumArray.get(N));

	}
}
