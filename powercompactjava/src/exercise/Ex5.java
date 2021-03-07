package exercise;

import java.util.*;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] array = new int[50000];
		ArrayList<Integer> arrangedArray = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			Integer input = sc.nextInt();
			array[i] = input;
			arrangedArray.add(input);
		}
		arrangedArray.sort(Comparator.naturalOrder());
		Map<String, String> m = new HashMap<String, String>();
		for(int i=0; i<arrangedArray.size(); i++) {
			m.put(Integer.toString(arrangedArray.get(i)), Integer.toString(i));
		}
		for(int i=0; i<arrangedArray.size(); i++) {
			System.out.print(m.get(array[i]+"") + " ");
		}
	}
}
