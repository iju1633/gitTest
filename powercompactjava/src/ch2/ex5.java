package ch2;
import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		
		System.out.print("����� ������?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String t = Integer.toBinaryString(num); // key point : 2������ �ٲٴ� ���
		
		// int result = Integer.parseInt(t); �̷����ϸ� 2������ �ƴ϶� 10������ �ٲ�.
		
		System.out.println("����: " + num);
		System.out.println(num + ": " + t);
		
		sc.close();
	}
	
}

