package ch1;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;



public class Chap1ex1 {
	
	public static void main(String[] args) {
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.dd"); // key point
		Date date = new Date();
		String time = format1.format(date);
		
		
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("����� �й��� �������ּ��� : ");
		int id = input1.nextInt();
		
		System.out.println("����� �̸��� �������ּ��� : ");
		String name = input2.next();
		
		System.out.println("------------");
		System.out.println("�й��� " + id + "�Դϴ�.");
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println(time);
		
		input1.close();
		input2.close();
		
}
	
}
