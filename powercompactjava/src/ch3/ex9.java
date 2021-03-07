package ch3;
import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {

		
		int[] array = new int[100];
		array[0] = 0;
		array[1] = 1;
		for(int i=0; i<98; i++) {
			array[i+2] = array[i+1] + array[i];
		}
		System.out.print("출력하고 싶은 항의 개수는?");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("-----------");
		System.out.println("출력할 항의 개수: " + num);
		for(int i=0; i<num; i++) {
			System.out.print(array[i] + " ");
		}
		
		sc.close();
	}

}
/*  출력은 첫째항을 하고 계속해서 갱신해 나가는 방법
import java.util.Scanner;

public class ProgrammingExercise39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i[] = {0, 1};
		
		System.out.print("출력할 항의 개수:");
		short select = scan.nextShort();
		
		for(int a = 0; a<select;a++) {
			System.out.print(i[0] + " ");
			int next = i[0] + i[1];
			i[0] = i[1];
			i[1] = next;
		}
	}
}
*/
