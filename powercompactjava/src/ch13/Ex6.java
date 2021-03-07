package ch13;

import java.io.*;
public class Ex6 {

	public static void main(String[] args) throws IOException{
		int value;
		int key = 0x33;
		BufferedReader input = null;
		BufferedWriter output = null;
		
		try {
			input = new BufferedReader(new FileReader("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\input.txt"));
			output = new BufferedWriter(new FileWriter("C:\\Users\\82102\\OneDrive\\바탕 화면\\memos\\output.txt"));
			value = 0;
			while ((value = input.read()) != -1) {
				value = value^key;
				output.write(value);
			}
			input.close();
			output.close();
		}
		catch(IOException e) {
			System.out.println("입출력 오류입니다.");
		}
	}

}
