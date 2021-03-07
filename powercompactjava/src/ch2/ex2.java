package ch2;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		double mile = 1.609;
		System.out.print("마일을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		double result = sc.nextDouble();
		
		System.out.print(result + "마일은 " + result * mile + "킬로미터입니다.");
		
		sc.close();
	}

}
