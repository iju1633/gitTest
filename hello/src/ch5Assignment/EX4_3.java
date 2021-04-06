package ch5Assignment;

class Account { // 생성자 오버라이딩해서 새로운 철수계좌가 생성되었습니다.와 같은 표현을 출력하게 해도 되는지
				// 부가적인 내용인데, withdraw이나 transfer할 때 balance가 인출이나 전송하려는 값보다 
				// 작으면 함수가 실행되어서는 안되니까 이에 대한 조치도 해야하는지
	String name;
	int balance;

	public Account() {
		name = "철수";
		balance = 0;
	}

	public Account(String name) {
		this.name = name;
		System.out.println("새로운 " + name + " 계좌가 생성되었습니다.");
	}

	void withdraw(int amount) {
		if (balance < amount) {
			System.out.println("잔금이 부족합니다.");
		}
		balance -= amount;
		System.out.println(amount + "원 인출");
	}

	void deposit(int amount) {
		balance += amount;
		System.out.println(amount + "원 저축");
	}

	void transfer(int amount, Account account) { // 현재 계좌에서 매개변수의 계좌로 amount만큼 전송
		if (balance < amount) {
			System.out.println("잔금이 부족합니다.");
		}
		balance -= amount;
		account.balance += amount;
		System.out.println(this.name + "가 " + account.name + "에게 " + amount + "원 이체함");
	}

	void print() {
		System.out.println("고객 " + this.name + " 계좌잔고=" + balance + "원");
	}
}

public class EX4_3 {

	public static void main(String[] args) {

		Account account1 = new Account("철수");
		account1.deposit(50000);
		Account account2 = new Account("영희");
		account2.deposit(100000);

		account1.print();
		account2.print();
		account2.transfer(50000, account1);
		account1.print();
		account2.print();

	}

}
