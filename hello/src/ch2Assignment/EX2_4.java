package ch2Assignment;

import java.util.*;

public class EX2_4 {

	public static void main(String[] args) { // ������ ���� �ݺ� ���� ������� �ʰ� �غ��ڶ�� �ǰ� �ݿ�, �ݺ��� �Ἥ ���� 0�� �ɶ����� �ϴ� ����� ����
		// TODO Auto-generated method stub
		System.out.print("����: ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num; // ������ Ǫ�� ���� �߿� num�� ����� ���̹Ƿ� ��� ��¶����� ����ϱ� ���� temp������ num�� ����

		int a1 = num / 64; // a���� g���� 7���� ���ڸ� �̿��Ͽ� �������� �� �ڸ��� ��Ÿ��(���� : �ְ��ڸ�����)
		int a2 = num % 64;
		num = num - a1 * 64;

		int b1 = num / 32;
		int b2 = num % 32;
		num = num - b1 * 32;

		int c1 = num / 16;
		int c2 = num % 16;
		num = num - c1 * 16;

		int d1 = num / 8;
		int d2 = num % 8;
		num = num - d1 * 8;

		int e1 = num / 4;
		int e2 = num % 4;
		num = num - e1 * 4;

		int f1 = num / 2;
		int g1 = num % 2; // ������ �ڸ��� ���� 0�ƴ� 1�̹Ƿ� ���� ó������ �ʿ� ����
		num = num - f1 * 2;

		// ����� ���������� ��Ÿ�����ϱ� ������ �� �ڸ����� �˸´� ���� ������
		int result = a1 * 1000000 + b1 * 100000 + c1 * 10000 + d1 * 1000 + e1 * 100 + f1 * 10 + g1;

		System.out.println(temp + ": " + result);

	}

}
