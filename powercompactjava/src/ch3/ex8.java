package ch3;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {

		System.out.print("����� �����ڴ�?(+, -, *, /)");
		Scanner sc = new Scanner(System.in);
		String operator = sc.nextLine(); // String�� char������ ���� 0�� ù��°�� ������ ���� ������� �ǹ�.
		
		System.out.print("����� �� ����?(2��)");
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
				System.out.println("�и𿡴� 0�� �� �� �����ϴ�.");
		}
		else
			System.out.println("�ùٸ��� ���� �����ڰ� ���Ǿ����ϴ�.");
		
		sc.close();
		a.close();
		b.close();
		
	}

}
