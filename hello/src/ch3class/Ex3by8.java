package ch3class;

import java.util.*;

public class Ex3by8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month; // ���� ������ do�� while���� �ȿ� ���� �� �����Ƿ� ���� �ۿ��� �����ؾ���.
		do {
			System.out.print("�ùٸ� ���� �Է��Ͻÿ�[1-12]: ");
			month = sc.nextInt();
		} while (1 > month || month > 12); // while �����ȿ� �ش��ϸ� �ٽ� �ݺ��ϴ� ����
		System.out.println("����ڰ� �Է��� ���� " + month);
	}

}
