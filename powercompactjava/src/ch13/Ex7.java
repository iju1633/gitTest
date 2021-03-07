package ch13;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = null;
		BufferedWriter bfw = new BufferedWriter(
				new FileWriter("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\customer.txt"));
		HashMap<String, String> map = new HashMap<String, String>();
		String result;
		String id = ""; // ���� bfwó�� while ���� �ۿ����� ���̱� ������ �ۿ��� ������ �� ��, ����!
		String num = "";

		while (true) {
			System.out.print("����� ��ȣ��?(exit : -1)");
			Scanner t1 = new Scanner(System.in);
			id = t1.nextLine();
			if (id.equals("-1")) // (try-catch)������ �Q��, ������ �� �ִ� �Ϳ� �����ϸ� �ڵ� �ۼ��Ұ�.
				break;

			System.out.print("����� �̸���?");
			Scanner t2 = new Scanner(System.in);
			String name = t2.nextLine();

			System.out.print("����� ��ȭ��ȣ��?");
			Scanner t3 = new Scanner(System.in);
			num = t3.nextLine();

			System.out.print("����� �̸����ּҴ�?");
			Scanner t4 = new Scanner(System.in);
			String address = t4.nextLine();
			System.out.print("============");
			array = new ArrayList<>();

			array.add(id);
			array.add(name);
			array.add(num);
			array.add(address);

			// ���Ϸ� ���嵵�ϰ�
			bfw.append(array + "\n"); // �߰��س����� �� ���� �߿���!

			// HashMap���ε� �����Ѵ�. ��ȣ�� �Է¹޾� �� ��ȣ�� �ش��ϴ� ��ȭ��ȣ�� ����� �� ����� ����, keypoint!
			map.put(id, num);
		}
		bfw.close();// �ڵ尡 ��� ��Ա� ���� �� ����.

		System.out.print("���ϴ� ����� ��ȣ��?");
		Scanner t5 = new Scanner(System.in);
		String input = t5.nextLine();
		
		result = map.get(input);
		System.out.print("����� ���ϴ� ��ȭ��ȣ�� " + result + "�Դϴ�.");
		if(map.containsKey(input) == false) {
			System.out.println("�ش��ϴ� ��ȣ�� �����ϴ�.");
		}

	}
}
