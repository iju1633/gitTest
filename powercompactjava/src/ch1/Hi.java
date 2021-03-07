package ch1;
import java.util.Scanner;
public class Hi {

	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("Why am I so lazy playing Java?");
		System.out.println("What is your number?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.printf("your chosen number is %d.",num);
		
		
		sc.close();
	}

}
