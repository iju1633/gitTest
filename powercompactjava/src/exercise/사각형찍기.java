package exercise;

import java.util.Scanner;

public class �簢����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		int b = 0; // ù ��°, �� ��° ����
		int b2 = n-4; // �߰� ����
		
		for (int i = 0; i < n - 2; i++) { // �� ���� �Ʒ� �� ���� �� ��
			if (i < (n-2) / 2) { // �������� �����ϰ� ����� ������
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=b2; j>0; j--) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b++;
				b2 -=2;
			} else if (i == (n-2)/2) { // ��� ��
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b--;
			} else { // �� �Ʒ����� �����ϰ� ��� �� �Ʒ����� ������
				b2 += 2;
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b2; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j=0; j<b; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				b--;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
		
	}
}

