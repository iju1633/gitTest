package ch1;

import java.util.Scanner;

public class Chap1ex3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� ����ϰ� ��������(Ȧ��) : ");
		
		int n = sc.nextInt();
		
		int a = 1; // �����ϴ� ���� ����
		int b = n/2; // �����ϴ� ������ ����
		
		for(int i=0; i<n; i++) {
			if(i<n/2) {
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println();
				a+=2;
				b--;
			}
			else {
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				for(int j = 0; j<a; j++) {
					System.out.print("*");
				}
				for(int j=b; j>0; j--) {
					System.out.print(" ");
				}
				System.out.println();
				a-=2;
				b++;
			}
		}
		
		
/*
		int count = sc.nextInt();
		int input = count / 2;

		for (int i = -input; i <= input; i++) { // �Է¹��� �� ��ŭ �� �����ϱ� ����.
			int k = 0; // ���ϱ����� k�� ���� ���ÿ� ����� ���� �ٷ� �Ѿ������ �ʱ�ȭ��.
			for (int j = 0; j < count - Math.abs(i); j++) { // Math.abs(a) : ���밪, ����� �� �����ؼ� 3�� 4�� 5�� 4�� 3�� ����ؾ���.(5���̶��)

				String result = k < Math.abs(i) ? " " : "*";
				System.out.print(result);
				k++;
			}
			System.out.println();
		}
	ex)	  *  
		 *** 
		*****
		 ***
		  *
*/
	}

}
