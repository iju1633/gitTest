package ch2;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		System.out.println("오렌지의 개수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int qoute = num/10;
		int remain = num % 10;
		
		System.out.printf("%d박스가 필요하고 %d개가 남습니다.", qoute, remain);
		
		sc.close();
	}
	
}
