package ch3;

public class ex1 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 || i%4 == 0)
				sum = sum + i; // key point
		}
		
		System.out.println("3 또는 4의 배수의 합=" + sum);
	}

}
