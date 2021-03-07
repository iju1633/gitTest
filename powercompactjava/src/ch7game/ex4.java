package ch7game;
import java.util.Scanner;

	
	public class ex4 {
	
		public static void main(String[] args) {
			System.out.print("문자열을 입력하시요 : ");
			Scanner sc = new Scanner(System.in);
			String a = sc.nextLine();
			String[] result = a.split(" "); // result 문자 배열에 한 단어씩 집어넣음(" " 기준으로)
			
			for(int i=0 ; i<result.length ; i++) {  // result에 있는 단어 개수 만큼 for문 반복
				System.out.print(result[i] + ",");
			}
			System.out.println();
			System.out.println("모두 " + result.length + "개의 단어가 있습니다.");
		
			sc.close();
		}
	
	}
