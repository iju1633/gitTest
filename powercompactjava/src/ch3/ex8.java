package ch3;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		System.out.print("당신의 연산자는?(+, -, *, /)");
		Scanner sc = new Scanner(System.in);
		String operator = sc.nextLine(); // String을 char단위로 나눔 0은 첫번째로 적히는 것을 읽으라는 의미.
		
		System.out.print("당신의 두 수는?(2개)");
		Scanner a = new Scanner(System.in);
		double num1 = a.nextDouble();
		Scanner b = new Scanner(System.in);
		double num2 = a.nextDouble();
		
		if(operator.equals("+")) {
			System.out.print(num1+"+"+num2+" = " + (num1+num2));
		}
		else if(operator.equals("-")) {
			System.out.print(num1 + "-" + num2 + " = " + (num1-num2));
		}
		else if(operator.equals("*")) {
			System.out.print(num1+"*"+num2+" = " + (num1*num2));
		}
		else if(operator.equals("/")){
			if(num2 != 0)
				System.out.print(num1+"/"+num2+" = " + (num1/num2));
			else
				System.out.println("분모에는 0이 올 수 없습니다.");
		}
		else
			System.out.println("올바르지 못한 연산자가 사용되었습니다.");
		
		sc.close();
		a.close();
		b.close();
		
	}

}
