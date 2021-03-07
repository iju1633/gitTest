package ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		BufferedReader bfr;
		try {
			bfr = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos for Java\\test.txt"));

			ArrayList<String> splitStr = new ArrayList<String>();
			String c;
			Map<String, Integer> m = new HashMap<>();
			while ((c = bfr.readLine()) != null) {
				String[] array = c.split(" "); // Good Job!
				for (int i = 0; i < array.length; i++) {
					splitStr.add(array[i]);
				}
			}

			for (int i = 0; i < splitStr.size(); i++) {

				// 키가 존재하면 해당 키의 value + 1 map(key, value) 구조
				if (m.containsKey(splitStr.get(i))) {
					m.put(splitStr.get(i), m.get(splitStr.get(i)) + 1); // important idea!!

				} else {
					m.put(splitStr.get(i), 1);
				}
			}
			/* 단어 빈도수 출력하기 */
			for (String key : m.keySet()) {
				System.out.println(key + "-->" + m.get(key)); // key point!!
			}
			System.out.println("전체 단어 수: " + splitStr.size());
			bfr.close();
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}
}
