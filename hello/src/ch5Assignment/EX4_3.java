package ch5Assignment;

class Account {

	String name;
	int balance;

	public Account(String name) {
		this.name = "ö��/����";
		balance = 0;

		this.name = name;
		System.out.println("���ο� " + name + " ���°� �����Ǿ����ϴ�.");
	}

	public void withdraw(int amount) {
		if (balance < amount) { // balance�� �����Ϸ��� ������ ���� ������ ���� ���ϹǷ� ȣ�� �������� �ý����� ������ ��
			System.out.println("�ܱ��� �����մϴ�.");
			System.exit(0);
		}
		balance -= amount;
		System.out.println(amount + "�� ����");
	}

	public void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "�� ����");
	}

	public void transfer(int amount, Account account) { // ���� ���¿��� �Ű������� ���·� amount��ŭ ����
		if (balance < amount) { // balance�� �����Ϸ��� ������ ���� ������ ���� ���ϹǷ� ȣ�� �������� �ý����� ������ ��
			System.out.println("�ܱ��� �����մϴ�.");
			System.exit(0);
		}
		balance -= amount;
		account.balance += amount;
		System.out.println(this.name + "�� " + account.name + "���� " + amount + "�� ��ü��");
	}

	public void print() {
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
