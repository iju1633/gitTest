package ch13;

import java.io.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// output.txt 만드는 방법
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\82102\\OneDrive\\바탕 화면\\input.txt"));
//
//		bw.write("package text 13");
//		bw.newLine();
//		bw.write("import java.util.io.;*");
//		bw.write("import java.util.arrays;");
//		bw.close();

		// 파일을 읽어와서 소문자를 대문자로 바꾸기
		BufferedReader br;
		BufferedWriter bfw;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos for Java\\input.txt"));
			bfw = new BufferedWriter(new FileWriter("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos for Java\\output.txt"));
			String c;
			while ((c = br.readLine()) != null) { // : 쓸때는 for, != null or -1 쓸때는 while^^

				bfw.write(c.toUpperCase());
				bfw.newLine();

			}
			br.close(); // 닫아야 정보들이 저장돼!
			bfw.close();
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}
}
