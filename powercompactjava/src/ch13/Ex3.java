package ch13;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ex3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bfr;
		PrintWriter pw;
		try {
			bfr = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\πŸ≈¡ »≠∏È\\memos for Java\\input.txt"));
			pw = new PrintWriter("C:\\Users\\82102\\OneDrive\\πŸ≈¡ »≠∏È\\memos for Java\\output.txt");
			
			String c;
			ArrayList<String> a = new ArrayList<>();
			while((c = bfr.readLine()) != null) {
				a.add(c);
			}
			
			for(int i=0; i<a.size(); i++) {
			pw.write((i+1) + " : " + a.get(i));
			pw.println();
			}
			bfr.close(); // ¡ﬂø‰!! ¿Ã∞≈ æ»«œ∏È ∞¡ ∫Ûƒ≠¿”.
			pw.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
