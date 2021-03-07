package ch13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr;
		PrintWriter pw;
		try {
			bfr = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\input.txt"));
			pw = new PrintWriter("C:\\Users\\82102\\OneDrive\\���� ȭ��\\memos\\output.txt");
			
			String c;
			ArrayList<Integer> a = new ArrayList<>();
			while((c = bfr.readLine()) != null) {
				a.add(Integer.parseInt(c));
			}
			
			Collections.sort(a);
			for(int i=0; i<a.size(); i++) {
			pw.write(Integer.toString(a.get(i)));
			pw.println();
			}
			bfr.close(); // �߿�!! �̰� ���ϸ� �� ��ĭ��.
			pw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
