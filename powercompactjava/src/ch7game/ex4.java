package ch7game;
import java.util.Scanner;

	
	public class ex4 {
	
		public static void main(String[] args) {
			System.out.print("���ڿ��� �Է��Ͻÿ� : ");
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			String[] result = a.split(" "); // result ���� �迭�� �� �ܾ �������(" " ��������)
			
			for(int i=0 ; i<result.length ; i++) {  // result�� �ִ� �ܾ� ���� ��ŭ for�� �ݺ�
				System.out.print(result[i] + ",");
			}
			System.out.println();
			System.out.println("��� " + result.length + "���� �ܾ �ֽ��ϴ�.");
		
			sc.close();
		}
	
	}
