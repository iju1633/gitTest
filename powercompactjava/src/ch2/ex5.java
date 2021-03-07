package ch2;
import java.util.Scanner;


public class ex5 {

	public static void main(String[] args) {
		
		System.out.print("당신의 정수는?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String t = Integer.toBinaryString(num); // key point : 2진수로 바꾸는 방법
		
		// int result = Integer.parseInt(t); 이렇게하면 2진수가 아니라 10진수로 바뀜.
		
		System.out.println("정수: " + num);
		System.out.println(num + ": " + t);
		
		sc.close();
	}
	
}

