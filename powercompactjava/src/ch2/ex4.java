package ch2;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		
		
		System.out.println("���� �������� ���ΰ���?");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double c = 4.0/3.0* Math.pow(r,3); //Math.pow(r,3) ^^
		
		System.out.println("���� ������: " + r);
		System.out.println("���� ����: " + c); 
		
		sc.close();
		
	}
}
