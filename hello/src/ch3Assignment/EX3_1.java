package ch3Assignment;

public class EX3_1 {

	public static void main(String[] args) {
		int star = 5;
		int space = 0;

		for (int i = 0; i < 3; i++) { // 3�ٱ���
			for (int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star -= 2;
			space++;
		}
		star = 3; // ������ ������ ��°�� ó���ϰ� star�� space ���� ������ �� �� �� ����Ǿ����Ƿ� for�� �������� �� �� ������ �ʱ�ȭ�������
		space = 1;

		for (int i = 4; i <= 5; i++) { // 4��, 5��

			for (int j = space; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}

			System.out.println();
			star += 2;
			space--;
		}
	}

}
