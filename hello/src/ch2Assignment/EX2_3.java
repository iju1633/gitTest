package ch2Assignment;

import java.util.*;

public class EX2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ��: ");
		int input = sc.nextInt();

		System.out.print("��ǰ ����: ");
		int cost = sc.nextInt();

		int tax = (int) (cost * 0.1); // 0.1�� double���̹Ƿ� down casting ���� �ʿ� ����, ������ ���â�� ���� �� integer
		int remain = input - cost;
		System.out.println("�ΰ���: " + tax);
		System.out.println("�ܵ�: " + remain);

	}

}
