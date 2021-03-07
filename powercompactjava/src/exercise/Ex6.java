package exercise;

import java.io.*;

public class Ex6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;
		
		while ((input = br.readLine()) != null) {
			String[] inputs = input.split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			bw.write(String.valueOf(a + b));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}