package ch13;

import java.io.*;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// output.txt ����� ���
//		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\82102\\OneDrive\\���� ȭ��\\input.txt"));
//
//		bw.write("package text 13");
//		bw.newLine();
//		bw.write("import java.util.io.;*");
//		bw.write("import java.util.arrays;");
//		bw.close();

		// ������ �о�ͼ� �ҹ��ڸ� �빮�ڷ� �ٲٱ�
		BufferedReader br;
		BufferedWriter bfw;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos for Java\\input.txt"));
			bfw = new BufferedWriter(new FileWriter("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos for Java\\output.txt"));
			String c;
			while ((c = br.readLine()) != null) { // : ������ for, != null or -1 ������ while^^

				bfw.write(c.toUpperCase());
				bfw.newLine();

			}
			br.close(); // �ݾƾ� �������� �����!
			bfw.close();
		}

		catch (IOException e) {
			System.out.println(e);
		}
	}
}
