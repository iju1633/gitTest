package ch4;

import java.io.*;

class bok{
	int real=0;
	int bok=0;
	
	static BufferedReader in;
	static {
		in = new BufferedReader(new InputStreamReader(System.in));
	}
	
	void Putreal(int real) {
		this.real = real;
	}
	void Putboksosu(int boksosu) {
		this.bok = boksosu;
	}
	
}
public class anotherex4 {
	public static void main(String[] ar) throws IOException {
		bok a = new bok();
		
		System.out.print("실수부: ");
		a.Putreal(Integer.parseInt(bok.in.readLine()));
		
		System.out.print("복소수: ");
		a.Putboksosu(Integer.parseInt(bok.in.readLine()));
		
		System.out.print(a.real + "+" + a.bok + "i");
		
	}
}
