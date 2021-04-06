package ch5Assignment;

class Account { // ������ �������̵��ؼ� ���ο� ö�����°� �����Ǿ����ϴ�.�� ���� ǥ���� ����ϰ� �ص� �Ǵ���
				// �ΰ����� �����ε�, withdraw�̳� transfer�� �� balance�� �����̳� �����Ϸ��� ������ 
				// ������ �Լ��� ����Ǿ�� �ȵǴϱ� �̿� ���� ��ġ�� �ؾ��ϴ���
	String name;
	int balance;

	public Account() {
		name = "ö��";
		balance = 0;
	}

	public Account(String name) {
		this.name = name;
		System.out.println("���ο� " + name + " ���°� �����Ǿ����ϴ�.");
	}

	void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("�ܱ��� �����մϴ�.");
		}
		balance -= amount;
		System.out.println(amount + "�� ����");
	}

	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "�� ����");
	}

	void transfer(int amount, Account account) { // ���� ���¿��� �Ű������� ���·� amount��ŭ ����
		if (balance < amount) {
			System.out.println("�ܱ��� �����մϴ�.");
		}
		balance -= amount;
		account.balance += amount;
		System.out.println(this.name + "�� " + account.name + "���� " + amount + "�� ��ü��");
	}

	void print() {
		System.out.println("�� " + this.name + " �����ܰ�=" + balance + "��");
	}
}

public class EX4_3 {

	public static void main(String[] args) {

		Account account1 = new Account("ö��");
		account1.deposit(50000);
		Account account2 = new Account("����");
		account2.deposit(100000);

		account1.print();
		account2.print();
		account2.transfer(50000, account1);
		account1.print();
		account2.print();

	}

}
