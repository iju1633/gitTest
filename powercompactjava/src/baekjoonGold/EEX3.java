package baekjoonGold;

import java.util.*;

public class EEX3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] inputs = input.split(" ");
		int N = Integer.parseInt(inputs[0]);
		int M = Integer.parseInt(inputs[1]);
		int E = Integer.parseInt(inputs[2]);
		
		String food = sc.nextLine();
		String[] foods = food.split(" ");
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<foods.length; i++) {
			array.add(Integer.parseInt(foods[i]));
		}
		int index = 0;
		int min = Math.abs(array.get(0)-E);
		for(int i=0; i<array.size(); i++) {
			if(min > array.get(i)) {
				min = array.get(i);
				index = i;
			}
		}
		
		System.out.println(array.get(index+M) - array.get(index-M+1));
		
	}
}
