package ch4;

	class Account{
		
		int balance;

		void account() {
			balance = 0;
		}
		void withdraw(int amount) {
			System.out.println(amount + "원 인출");
			balance -= amount;
		}
		void deposit(int amount) {
			System.out.println(amount + "원 저축");
			balance += amount;
		}
		
		
	}
	
	public class ex5{ //아무것도 없이 쓰니까 몰랐어ㅡ
	
		public static void main(String[] args) {
		
			System.out.println("새로운 계좌가 만들어졌습니다");
			Account customer1 = new Account();
			customer1.deposit(50000);
			
			System.out.println("새로운 계좌가 만들어졌습니다");
			Account customer2 = new Account();
			customer2.deposit(100000);
			
			System.out.println("고객 #1 계좌 잔고=" + customer1.balance);
			System.out.println("고객 #2 계좌 잔고=" + customer2.balance);
			
		}
	
	}

