package ch4class;

public class Dice { // roll���� value���� �����ϸ� setValue�Ƚᵵ �ǰ�, roll���� ���� �������� setValue���� �� ���� �����ϸ� ��.
	private int value;

	public Dice() {
		value = 0;
	}

	public int roll() { // 1~6���� �����ϳ� ����
		int result = (int) (Math.random() * 6) + 1;
		return result;
	}

	public void setValue(int value) { // roll()���� ������ ���� ���� ����
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		Dice d1 = new Dice(); // �ֻ��� 2�� ����
		Dice d2 = new Dice();

		int cnt = 1; // �ѹ��� �����ϴ� ��� �ɸ�ȸ���� 1�̱� ������ 1�� �ʱ�ȭ�ؾ���
		while (true) {

			d1.setValue(d1.roll());
			int result1 = d1.getValue();

			d2.setValue(d2.roll());
			int result2 = d2.getValue();

			System.out.println("�ֻ���1=" + result1 + " �ֻ���2=" + result2);
			if (result1 + result2 == 2) {
				System.out.println("(1,1)�� �����µ� �ɸ�ȸ�� = " + cnt);
				break;
			}
			cnt++;
		}
	}

}
