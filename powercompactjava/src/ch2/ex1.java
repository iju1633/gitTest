package ch2;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		System.out.println("�������� ������ �Է��Ͻÿ�: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int qoute = num/10;
		int remain = num % 10;
		
		System.out.printf("%d�ڽ��� �ʿ��ϰ� %d���� �����ϴ�.", qoute, remain);
		
		sc.close();
	}
	
}
