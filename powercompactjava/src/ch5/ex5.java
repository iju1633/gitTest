package ch5;

	class BankAccount{
		public int balance = 0;
	
		int getBalance(int amount) {
			balance += amount;
			return this.balance;
		}
		public int transfer(int amount, BankAccount otherAccount) {
			otherAccount.balance += amount;
			this.balance -= amount;
			return amount; 		// key sentence
		}
		void showInfo() {
			System.out.println("현재 잔액은 " + balance + "입니다.");
		}
		
	}


	public class ex5 {
		
		public static void main(String[] args) {
			
		BankAccount myAccount1 = new BankAccount();
		BankAccount myAccount2 = new BankAccount();
		
		myAccount1.balance = 10000;
		myAccount2.balance = 0;
		myAccount1.showInfo();
		myAccount2.showInfo();
		
		System.out.println("transfer(" + myAccount1.transfer(1000, myAccount2) + ")" );
		
		myAccount1.showInfo();
		myAccount2.showInfo();
		
		}

	}
