package ch2Assignment;

import java.util.*;

public class EX2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("�������� ������ �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		int orange = sc.nextInt();

		int box = orange / 10; // ��
		int remain = orange % 10; // ������

		System.out.println(box + "�ڽ��� �ʿ��ϰ� " + remain + "���� �����ϴ�.");

	}

}
