package ch2;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		System.out.print("얼마를 내실 건가요?");
		Scanner num1 = new Scanner(System.in);
		int input = num1.nextInt();
		
		System.out.print("상품의 가격은 얼마인가요?");
		Scanner num2 = new Scanner(System.in);
		int price = num2.nextInt();
		
		double tax = price * 0.1;
		double remain = input - price;
		
		System.out.println("받은 돈: " + input);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + remain);
		
		num1.close();
		num2.close();
		
	}

}
