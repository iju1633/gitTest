package ch3;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		System.out.print("����� Ű��?");
		Scanner num1 = new Scanner(System.in);
		double height = num1.nextDouble();
		
		System.out.print("����� ü����?");
		Scanner num2 = new Scanner(System.in);
		double weight = num2.nextDouble();
		
		double avgWeight = (height - 100) * 0.9;
		
		System.out.println("----------");
		System.out.println("Ű�� �Է��ϼ���: " + height);
		System.out.println("�����Ը� �Է��ϼ���: " + weight);
		
		if(weight>avgWeight)
			System.out.println("��ü���Դϴ�.");
		else if(weight==avgWeight)
			System.out.println("ǥ��ü���Դϴ�.");
		else
			System.out.println("��ü���Դϴ�.");
		
		num1.close();
		num2.close();
	}

}
