package ch2;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		double mile = 1.609;
		System.out.print("������ �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		double result = sc.nextDouble();
		
		System.out.print(result + "������ " + result * mile + "ų�ι����Դϴ�.");
		
		sc.close();
	}

}
