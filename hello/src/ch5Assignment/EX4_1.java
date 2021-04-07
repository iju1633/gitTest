package ch5Assignment;

class Dice {
	int value;

	Dice() {
		value = 0;
	}

	public void roll() {
		this.value = (int) (Math.random() * 6 + 1);
	}

	public int getValue() {
		return value;
	}

	public void setValue() {
		roll();
	}
}

public class EX4_1 {

	public static void main(String[] args) {

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int num = 1;

		while (true) {
			dice1.setValue();
			int result1 = dice1.getValue();
			
			dice2.setValue();
			int result2 = dice2.getValue();

			System.out.println("�ֻ���1=" + result1 + " �ֻ���2=" + result2);
			if (result1 + result2 == 2) {
				System.out.println("(1, 1)�� �����µ� �ɸ�ȸ�� = " + num);
				break;
			}
			num++;
		}
	}

}