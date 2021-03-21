package ch3;

public class ex7 {

	public static void main(String[] args) {


		for (int c = 1; c < 100; c++) {
			for (int a = 1; a < c; a++) {
				for (int b = 1; b < c; b++) {
					if (a * a + b * b == c * c) {
						System.out.println(a + " " + b + " " + c);
					}
				}
			}
		}
	}
}
