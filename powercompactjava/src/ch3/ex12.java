package ch3;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		double sum = 0.0;
		for(int i=0; i<5; i++) {
			System.out.print("����� ������?");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			sum += input;
		}
		
		System.out.println("-----------------");
		System.out.println("�հ�: " + (int)sum);
		System.out.println("���: " + sum/5);
		
		

	}
	
}
