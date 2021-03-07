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
			word = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\words.txt"));
			array = new ArrayList<>();
			while ((a = word.readLine()) != null) { // words.txt에 있는 단어들을 ArrayList array에 넣음.
				array.add(a);
			}
			// 단어를 랜덤하게 선택하는 알고리즘
			index = (int) Math.random() * (array.size() - 1) + 1;// 랜덤으로 index 구함.
			chosenWord = array.get(index);
			System.out.print("현재의 상태 : ");
			for (int k = 0; k < chosenWord.length(); k++) {
				System.out.print("_");
			}

			chosenWordArray = new ArrayList<String>();
			for (int i = 0; i < chosenWord.length(); i++) { // chosenWord의 각 문자 하나하나를 chosenWordArray에 넣음.
				chosenWordArray.add(chosenWord.charAt(i) + ""); //charAt(i)이 keypoint!, ""는 센스^^
			}

			for (int i = 0; i < chosenWord.length(); i++) { // 랜덤으로 뽑힌 단어의 길이만큼 _가 ArrayList hiddenWord에 생김.
				hiddenWordArray.add("_");
			}

			System.out.println();
			System.out.print("글자를 추측하시오 : ");
			
			while(true) {
			Scanner sc = new Scanner(System.in);
			input = sc.next();
			for (int j = 0; j < chosenWordArray.size(); j++) {
				if (input.equals(chosenWordArray.get(j))) { // 서로 일치하는 글자가 나오면
					hiddenWordArray.remove(j);
					hiddenWordArray.add(j, input);// 일치하는 j번째를 찾아서 hiddenWordArray의 j번째 문자를 input으로 바꿈. 빼고 넣는게 keypoint!
				}
			}
			System.out.print("현재의 상태 : ");
			for (int k = 0; k < chosenWordArray.size(); k++) {
				System.out.print(hiddenWordArray.get(k));
			}
			System.out.println();
			System.out.print("글자를 추측하시오 : ");

			word.close();
			if(input.equals("-1")) {
				System.exit(0); // break을 두 번 해야하는데 그 방법을 잘 모르겠어서 이 방법을 채택.(try - catch)를 모두 빼면서 오류가 날 경우 에러구문 출력을 하도록하면 돼.
			}
			}
		} catch (IOException e) {
			System.out.println("입출력 오류입니다.");
		}
	}

}
