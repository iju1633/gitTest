package ch3Assignment;

public class EX3_7 {

	public static void main(String[] args) {

		String[] array1 = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] array2 = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		for (int i = 0; i < 5; i++) {
			int index1 = (int) (Math.random() * 4); // index�� ���� 0, 1, 2, 3�� �������� ���;��ϴ� ���̹Ƿ� 4�� ���ϴ� ���̴�
			int index2 = (int) (Math.random() * 13); // index�� ���� 0, 1,..., 11, 12�� �������� ���;��ϴ� ���̹Ƿ� 13�� ���ϴ� ���̴�

			System.out.print(array1[index1] + "�� " + array2[index2]);
			System.out.println();
		}
	}

}
