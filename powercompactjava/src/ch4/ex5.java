package ch4;

	class Account{
		
		int balance;

		void account() {
			balance = 0;
		}
		void withdraw(int amount) {
			System.out.println(amount + "�� ����");
			balance -= amount;
		}
		void deposit(int amount) {
			System.out.println(amount + "�� ����");
			balance += amount;
		}
		
		
	}
	
	public class ex5{ //�ƹ��͵� ���� ���ϱ� �������
	
		public static void main(String[] args) {
		
			System.out.println("���ο� ���°� ����������ϴ�");
			Account customer1 = new Account();
			customer1.deposit(50000);
			
			System.out.println("���ο� ���°� ����������ϴ�");
			Account customer2 = new Account();
			customer2.deposit(100000);
			
			System.out.println("�� #1 ���� �ܰ�=" + customer1.balance);
			System.out.println("�� #2 ���� �ܰ�=" + customer2.balance);
			
		}
	
	}

