package ch2;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		System.out.print("�󸶸� ���� �ǰ���?");
		Scanner num1 = new Scanner(System.in);
		int input = num1.nextInt();
		
		System.out.print("��ǰ�� ������ ���ΰ���?");
		Scanner num2 = new Scanner(System.in);
		int price = num2.nextInt();
		
		double tax = price * 0.1;
		double remain = input - price;
		
		System.out.println("���� ��: " + input);
		System.out.println("��ǰ����: " + price);
		System.out.println("�ΰ���: " + tax);
		System.out.println("�ܵ�: " + remain);
		
		num1.close();
		num2.close();
		
	}

}
