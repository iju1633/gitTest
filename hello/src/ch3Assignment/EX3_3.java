package ch3Assignment;

public class EX3_3 {

	public static void main(String[] args) {

		for (int a = 1; a < 100; a++) { // ��� ���� �����ϰ� ������ ���� for���� ���� �߿�
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					if (a * a + b * b == c * c) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}

}
