package ch3;

public class ex6 {

	public static void main(String[] args) {
		
		boolean sosu = false; //�ʱ�ȭ ���� �� ��, �������.
		
		for(int x=2; x<=100; x++) {
			for(int y=2; y<x; y++) { // another key point
				
				if (x % y == 0) {
					sosu = false;
					break;
				}
				
			}
			if(sosu == true) {
				System.out.print(x + " ");	
			}
			sosu = true; // key point
		}
		
	}
}
