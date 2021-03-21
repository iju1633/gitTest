package ch3class;

public class Ex3Mini2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1 = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] array2 = {"2", "3", "4", "5", "6" ,"7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		for(int i=0; i<5; i++) {
			int index1 = (int)(Math.random()*4);
			int index2 = (int)(Math.random()*13);
			
			System.out.print(array1[index1] + "ÀÇ " + array2[index2]);
			System.out.println();
		}
	}

}
