package ch12;

import java.util.*;
public class Ex6 {

	public static void main(String[] args) { // while(true) ����!
		
		while(true) {
			
			Map<String, String> list = new HashMap<String, String>();
			
			list.put("java", "�ڹ�");
			list.put("computer", "��ǻ��");
			
			System.out.print("���� �ܾ �Է��Ͻÿ�:");
			Scanner sc = new Scanner(System.in);
			String input  = sc.next();
			
			for(String key : list.keySet()) {
				if(input.equals(key)) {
					System.out.println("�ܾ��� �ǹ�:" + list.get(key));
				}
			}
			
			if(input.equals("-1")) {
				System.out.println("�����ϼ̽��ϴ�.");
				break;
			}
			
			
		}

		
	}

}
