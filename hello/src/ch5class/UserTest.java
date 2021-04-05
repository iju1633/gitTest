package ch5class;

import java.util.*;

class User {
	String id, pw;
	static int count;

	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
		count++;
	}
}

public class UserTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User[] users = new User[5];
		int count = 0;

		while (true) {
			System.out.println("======================");
			System.out.println("1. Sign up");
			System.out.println("2. Login");
			System.out.println("3. Print All Users");
			System.out.println("4. Exit");
			System.out.println("======================");
			System.out.print("��ȣ�� �Է��Ͻÿ�: ");

			int num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.print("Id: ");
				String id = sc.next();
				System.out.print("Password: ");
				String pw = sc.next();
				users[User.count] = new User(id, pw);
				break;

			case 2:
				System.out.print("Id: ");
				String inputID = sc.next(); // id = sc.next()�� �������� ǰ. ������ ���� ���� �̸� �ٸ��� ��
				System.out.print("Password: ");
				String inputPW = sc.next();
				int i = 0;
				for (i = 0; i < User.count; i++) {
					if (users[i].id.equals(inputID) && users[i].pw.equals(inputPW)) {
						System.out.println("�α��� �Ǿ����ϴ�.");
						break;
					}
				}
				if (i == User.count) { // ������ for���� i�� �� ���� �׶� i ���� count�̴�. ���� �� ���Ҵµ��� ��ġ�ϴ� ���� ���ٸ� ���� �޽��� ���
					System.out.println("���̵� Ȥ�� ��й�ȣ�� �߸� �ԷµǾ����ϴ�.");
				}
				break;

			case 3:
				for (int k = 0; k < User.count; k++) { // Print All Users�� ���� ����
					System.out.println("{ " + users[k].id + ", " + users[k].pw + " }");
				}
				break;

			case 4:
				System.out.println("����Ǿ����ϴ�.");
				System.exit(0);
			}

		}
	}
}
