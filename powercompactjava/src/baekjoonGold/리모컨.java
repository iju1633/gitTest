package baekjoonGold;

import java.util.*;

public class ������ { // ��� �ϸ� ���������ؼ� ���� ���� ä�ΰ� �ִ��� ����� ���� ������ �� ������?
					// * ������ ���� ���̴� ��� ���ϸ� ������?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int wannabe = sc.nextInt(); // ���� ���� ä�� �Է¹���
		int unavailable = sc.nextInt(); // ���峭 Ű�� ���� �Է¹���
		
		ArrayList<Integer> button = new ArrayList<Integer>();
		for(int i=0; i<=9; i++) { // 0~9���� ����ִ� button �迭 ����
			button.add(i);
		}
		
		for(int i=0; i<unavailable; i++) { // ���峭 ��ư�� button �迭���� ������.
			int input = sc.nextInt();
			button.remove(input); // ���峭 ��ư ���� index���� ���Ƽ� remove �ż��� ��� ����.
		}
		
		// ���������ؼ� ���� ���� ä�ΰ� �ִ��� ����� ���� ����
		// ������ ���� ���� + (int) Math.abs(���� ���� ä�� - �ִ��� ����� ��) �� ����
		// (int) Math.abs(������� ä��-100) �� ���ؼ� �۰ų� ���� ���� ��� 
	}

}
