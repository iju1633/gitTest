package ch2;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		
		
		System.out.println("구의 반지름은 얼마인가요?");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double c = 4.0/3.0* Math.pow(r,3); //Math.pow(r,3) ^^
		
		System.out.println("구의 반지름: " + r);
		System.out.println("구의 부피: " + c); 
		
		sc.close();
		
	}
}
