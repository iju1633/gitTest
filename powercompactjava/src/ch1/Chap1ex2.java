package ch1;

import java.util.Scanner;


public class Chap1ex2 {
	
	public static void main(String[] args) {
		
	
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		Scanner input4 = new Scanner(System.in);
		
		
		System.out.println("����� �̸��� �������ּ��� : ");
		String name = input1.next();
		
		System.out.println("����� �ּ� �������ּ��� : ");
		String address = input2.nextLine(); // ������ ������ ���ڸ� �Է¹������� nextLine�Դϴ�. �׳� ���ڴ� next
		
		System.out.println("����� ��ȭ��ȣ�� �������ּ���(��ȣ����) : ");
		String phoneNum = input3.next();
		
		System.out.println("����� �а��� �������ּ��� : ");
		String major = input4.next();
		
		
		
		System.out.println("------------");
		System.out.println("�̸�: " + name);
		System.out.println("�ּ�: " + address);
		System.out.println("��ȭ��ȣ: " + phoneNum);		
		System.out.println("�а�: " + major);
		
		input1.close();
		input2.close();
		input3.close();
		input4.close();
		
}
	
}
