package ch3;
import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {

		double sum = 0.0;
		for(int i=0; i<5; i++) {
			System.out.print("당신의 성적은?");
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			double input = sc.nextDouble();
			sum += input;
		}
		
		System.out.println("-----------------");
		System.out.println("합계: " + (int)sum);
		System.out.println("평균: " + sum/5);
		
		

	}
	
}
