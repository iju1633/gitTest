package ch13;

import java.io.*;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		FileInputStream fin1 = null;
		FileInputStream fin2 = null;
		try {
			fin1 = new FileInputStream("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\input.txt");
			fin2 = new FileInputStream("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\input1.txt");
			
			int c1; int c2; Boolean ifSame = true ;
			while ((c1 = fin1.read()) != -1 && (c2 = fin2.read()) != -1) { // &&중요해^^ 2개를 동시에 읽는 방법!
				if (c1 == c2) {
					ifSame = true; // good idea!
				}
				else {ifSame = false;}
			}
			if(ifSame = true) {
				System.out.println("2개의 파일이 일치합니다."); // 이 문구를 한번만 출력시키기 위해 while 구문 밖에 배치함.
			}
			fin1.close();
			fin2.close();
		} catch (IOException e) {
			System.out.println("파일 입출력 오류");
		}
	}
}
