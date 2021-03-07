package ch13;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) throws IOException {

		BufferedReader word = null;
		ArrayList<String> array = null;
		String a, input;
		int index = 0;
		String chosenWord;
		ArrayList<String> chosenWordArray = new ArrayList<String>();
		ArrayList<String> hiddenWordArray = new ArrayList<String>();

		try {
			word = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\words.txt"));
			array = new ArrayList<>();
			while ((a = word.readLine()) != null) { // words.txt�� �ִ� �ܾ���� ArrayList array�� ����.
				array.add(a);
			}
			// �ܾ �����ϰ� �����ϴ� �˰���
			index = (int) Math.random() * (array.size() - 1) + 1;// �������� index ����.
			chosenWord = array.get(index);
			System.out.print("������ ���� : ");
			for (int k = 0; k < chosenWord.length(); k++) {
				System.out.print("_");
			}

			chosenWordArray = new ArrayList<String>();
			for (int i = 0; i < chosenWord.length(); i++) { // chosenWord�� �� ���� �ϳ��ϳ��� chosenWordArray�� ����.
				chosenWordArray.add(chosenWord.charAt(i) + ""); //charAt(i)�� keypoint!, ""�� ����^^
			}

			for (int i = 0; i < chosenWord.length(); i++) { // �������� ���� �ܾ��� ���̸�ŭ _�� ArrayList hiddenWord�� ����.
				hiddenWordArray.add("_");
			}

			System.out.println();
			System.out.print("���ڸ� �����Ͻÿ� : ");
			
			while(true) {
			Scanner sc = new Scanner(System.in);
			input = sc.next();
			for (int j = 0; j < chosenWordArray.size(); j++) {
				if (input.equals(chosenWordArray.get(j))) { // ���� ��ġ�ϴ� ���ڰ� ������
					hiddenWordArray.remove(j);
					hiddenWordArray.add(j, input);// ��ġ�ϴ� j��°�� ã�Ƽ� hiddenWordArray�� j��° ���ڸ� input���� �ٲ�. ���� �ִ°� keypoint!
				}
			}
			System.out.print("������ ���� : ");
			for (int k = 0; k < chosenWordArray.size(); k++) {
				System.out.print(hiddenWordArray.get(k));
			}
			System.out.println();
			System.out.print("���ڸ� �����Ͻÿ� : ");

			word.close();
			if(input.equals("-1")) {
				System.exit(0); // break�� �� �� �ؾ��ϴµ� �� ����� �� �𸣰ھ �� ����� ä��.(try - catch)�� ��� ���鼭 ������ �� ��� �������� ����� �ϵ����ϸ� ��.
			}
			}
		} catch (IOException e) {
			System.out.println("����� �����Դϴ�.");
		}
	}

}
