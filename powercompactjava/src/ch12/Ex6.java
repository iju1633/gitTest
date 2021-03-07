package ch12;

import java.util.*;
public class Ex6 {

	public static void main(String[] args) { // while(true) 굳굳!
		
		while(true) {
			
			Map<String, String> list = new HashMap<String, String>();
			
			list.put("java", "자바");
			list.put("computer", "컴퓨터");
			
			System.out.print("영어 단어를 입력하시오:");
			Scanner sc = new Scanner(System.in);
			String input  = sc.next();
			
			for(String key : list.keySet()) {
				if(input.equals(key)) {
					System.out.println("단어의 의미:" + list.get(key));
				}
			}
			
			if(input.equals("-1")) {
				System.out.println("수고하셨습니다.");
				break;
			}
			
			
		}

		
	}

}
