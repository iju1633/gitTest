package ch13;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = null;
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\customer.txt"));
		HashMap<String, String> map = new HashMap<String, String>();
		String result;
		String id = ""; // 위의 bfw처럼 while 구문 밖에서도 쓰이기 때문에 밖에서 설정해 준 것, 굳굳!
		String num = "";

		while (true) {
			System.out.print("당신의 번호는?(exit : -1)");
			Scanner t1 = new Scanner(System.in);
			id = t1.nextLine();
			if (id.equals("-1")) // (try-catch)구문을 뻈다, 오류날 수 있는 것에 유의하며 코드 작성할것.
				break;

			System.out.print("당신의 이름은?");
			Scanner t2 = new Scanner(System.in);
			String name = t2.nextLine();

			System.out.print("당신의 전화번호는?");
			Scanner t3 = new Scanner(System.in);
			num = t3.nextLine();

			System.out.print("당신의 이메일주소는?");
			Scanner t4 = new Scanner(System.in);
			String address = t4.nextLine();
			System.out.print("============");
			array = new ArrayList<>();

			array.add(id);
			array.add(name);
			array.add(num);
			array.add(address);

			// 파일로 저장도하고
			bfw.append(array + "\n"); // 추가해나가는 거 아주 중요해!

			// HashMap으로도 저장한다. 번호를 입력받아 그 번호에 해당하는 전화번호를 출력할 떄 사용할 예정, keypoint!
			map.put(id, num);
		}
		bfw.close();// 코드가 길면 까먹기 쉬운 거 같아.

		System.out.print("원하는 당신의 번호는?");
		Scanner t5 = new Scanner(System.in);
		String input = t5.nextLine();
		
		result = map.get(input);
		System.out.print("당신이 원하는 전화번호는 " + result + "입니다.");
		if(map.containsKey(input) == false) {
			System.out.println("해당하는 번호가 없습니다.");
		}

	}
}
