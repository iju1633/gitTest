package ch3;

public class ex7 {

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		boolean condition = true;
		
		for(int c = 1; c<100; c++) {
			for(int a=1; a<c; a++) {
				for(int b=1; b<c;b++) {
					if(a*a + b*b == c*c) {
						condition = true;
						System.out.println(a + " " +  b  + " " + c);
					}
				}
			}
		}
	}
}
